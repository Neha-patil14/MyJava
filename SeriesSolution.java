import java.util.Scanner;

public class SeriesSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of queries
        int q = scanner.nextInt();
        
        // Iterate over each query
        for (int i = 0; i < q; i++) {
            // Read the values of a, b, and n for this query
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int term = a;
            
            // Generate and print the series
            for (int j = 0; j < n; j++) {
                term += Math.pow(2, j) * b;
                System.out.print(term + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
