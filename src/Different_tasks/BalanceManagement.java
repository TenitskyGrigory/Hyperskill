package src.Different_tasks;

import java.util.Scanner;

/**
 * Your task is to implement the method changeBalance to control balances. It has the following declaration:
 *
 * public static boolean changeBalance(Account account, Operation operation, Long sum)
 * If the given operation is DEPOSIT the method adds the sum to the account's balance.
 * If the operation is WITHDRAW the method subtracts the given sum from the account's balance.
 * If the given sum is greater than the balance, the method shouldn't change it. Instead,
 * the method must output the string "Not enough money to withdraw." (without quotes, don't forget the full point).
 * In any case, the method returns a boolean value — true if the balance has changed, false if it hasn't.
 * Example 1
 *
 * The following values are passed to the method: operation = Operation.DEPOSIT,
 * sum = 2000. The initial balance of the account is 1000.
 *
 * In this case, the method returns "true" and the new account balance is 3000.
 *
 * Example 2
 *
 * The following values are passed to the method: operation = Operation.WITHDRAW,
 * sum = 5000. The initial balance of the account is 2000.
 *
 * In this case, the method returns "false", the account's balance is not changed (2000)
 * and method prints "Not enough money to withdraw.".
 */

public class BalanceManagement {

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        boolean value = true;

        if (operation == Operation.DEPOSIT) {
            account.balance += sum;
            value = true;
        } else if (operation == Operation.WITHDRAW) {
            if (account.balance < sum) {
                System.out.println("Not enough money to withdraw.");
                value = false;
            } else {
                account.balance -= sum;
                value = true;
            }
        }
        return value;
    }


    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}