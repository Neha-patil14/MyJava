//HackerRank code for java- 5
import java.util.Scanner;

public class FormattingOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %s - string, %-15s - left justified 15 characters
            // %03d - integer padded with leading zeroes to be 3 digits
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
