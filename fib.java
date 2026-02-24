import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();
            
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");

                // Calculate next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}
