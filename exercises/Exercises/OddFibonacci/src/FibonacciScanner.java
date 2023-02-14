import java.util.Scanner;

public class FibonacciScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // get user input for range
        System.out.println("Enter the range: ");
        int max = sc.nextInt();
        //generate the fibonacci sequence
        int[] fibonacci = generateFibonacci(max);
        //calculate the odd numbers in the sequence
        int oddCount = countOddNumbers(fibonacci);
        System.out.println("Number of odd numbers in the sequence: " + oddCount);
    }

    public static int[] generateFibonacci(int max) {
        int[] fibonacci = new int[max];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < max; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int countOddNumbers(int[] fibonacci) {
        int count = 0;
        for (int number : fibonacci) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}