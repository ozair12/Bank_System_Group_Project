public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;/*from  w w  w  .j  ava2  s. c  om*/

        do {
            System.out.println("Menu:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. while");
            System.out.println("  4. do-while");
            System.out.println("  5. for\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while( choice < '1' || choice > '5');

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("if\n");
                break;
            case '2':
                System.out.println("switch:\n");
                break;
            case '3':
                System.out.println("while:\n");
                break;
            case '4':
                System.out.println("do-while:\n");
                break;
            case '5':
                System.out.println("for:\n");
                break;
        }
    }
}