import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks for history");
        int a = sc.nextInt();
        System.out.println("enter marks for maths");
        int b = sc.nextInt();
        System.out.println("enter marks for english");
        int c = sc.nextInt();
        System.out.println("enter marks for science");
        int d = sc.nextInt();
        System.out.println("enter marks for 5th biology");
        int e = sc.nextInt();
        System.out.println("enter marks for 6th biology");
        int g = sc.nextInt();
        float total = 600;
        float sum = a+b+c+d+e+g;
        float percentage = (sum/total)*100;
        System.out.println("The peecentage of student is: " + percentage );


    }
}