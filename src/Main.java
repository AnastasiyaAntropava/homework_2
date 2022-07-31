import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (str.equals("Exit")) {
                break;
            }
            System.out.print("Please enter something: ");
            str = scanner.nextLine();
        }

//        while (true) {
//            if (str.equals("Exit"))
//                break;
//            else {
//                System.out.print("Please enter something: ");
//            }
//        }
    }
}