import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[] channels = { "empty", "STS", "TNT", "ONT"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        while (x != 0) {
            if (x < 0 || x >= channels.length) {
                System.out.print("Incorrect channel number, please enter a number: ");
            } else {
                System.out.println(channels[x]);
                System.out.print("Please enter a number: ");
            }
            x = scanner.nextInt();
        }
    }
}