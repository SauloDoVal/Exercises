import java.util.ArrayList;
        import java.util.Scanner;

public class FibonacciArrayListScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get user input for range
        System.out.println("Enter how many numbers will be in the sequence : ");
        int max = sc.nextInt();

        //generate the fibonacci sequence with the numbers inserted, and stores is in an array.
        ArrayList<Integer> fibonacci = generateFibonacci(max);
        System.out.println("the fibonacci sequence is : " + fibonacci);

        //calculate the odd numbers in the sequence
        int oddCount = countOddNumbers(fibonacci);
        System.out.println("Number of odd numbers in the sequence: " + oddCount);


    }
    //The same function as in the FibonacciArrayListRandom
    public static ArrayList<Integer> generateFibonacci(int max) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i < max; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }
        return fibonacci;
    }
    //The same counters as the others
    public static int countOddNumbers(ArrayList<Integer> fibonacci) {
        int count = 0;
        for (int number : fibonacci) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
