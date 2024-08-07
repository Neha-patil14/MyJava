//HackerRank code for java- 3
//here i am solving the hackerrank problem statement for conditional statements
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(n);
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            }
            else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
            else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
