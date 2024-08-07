//hackerRank code - 6
import java.util.Scanner;
public class Loops{
    public static void main(String[]args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=1;i<=10;i++){
          int result = N*i;
            System.out.println(N + " x " + i + " = " +  result) ;   
        }
        
    }
}
