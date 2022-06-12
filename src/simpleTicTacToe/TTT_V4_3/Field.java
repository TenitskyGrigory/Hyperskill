package src.simpleTicTacToe.TTT_V4_3;

public class Field {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
//        FillingInTheField(st);
//    }
    private String st;

    public static void FillingInTheField(String st) {
        st = st;
        String[] str = new String[9];
//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (st.charAt(i) == '_') {
                str[i] = " ";
            } else {
                str[i] = String.valueOf(st.charAt(i));
            }
        }
        System.out.println("---------");
        System.out.println("| " + str[0] + " " + str[1] + " " + str[2] + " |");
        System.out.println("| " + str[3] + " " + str[4] + " " + str[5] + " |");
        System.out.println("| " + str[6] + " " + str[7] + " " + str[8] + " |");
        System.out.println("---------");
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }
}
