import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int score = scanner.nextInt();
        while (score < 0 || score > 100) {
            System.out.print("Invalid value, please try again: \n");
            score = scanner.nextInt();
        }



        //else if (score >= 80) {
            //System.out.println("Your grade is B!");

    }
}