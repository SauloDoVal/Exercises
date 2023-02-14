import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class FibonacciBigIntArrayListRandom {

    public static void main(String[] args) {
        //Generate a random number from 1 to 100
        int max = getRandomNumberInRange(1, 100000);
        //Generate the Fibonacci sequence up to a random from 1 to 1000 and store it in the arraylist
        ArrayList<BigInteger> fibonacci = generateFibonacci(max);
        System.out.println("Fibonacci sequence up to " + max + ": " + fibonacci);

        //Calculate number of odd numbers in the Fibonacci sequence
        int count = countOddNumbers(fibonacci);
        System.out.println("Number of odd numbers in the sequence: " + count);

        //Prints the Odd numbers in the sequence
        printOddNumbers(fibonacci);

    }
    //For more information about this function, please take a look at FibonacciRandom
    public static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<BigInteger> generateFibonacci(int fmax) {
        //The line below declares and initializes an ArrayList called fibonacci to store the sequence.
        ArrayList<BigInteger> fibonacci = new ArrayList<>();
        fibonacci.add(BigInteger.ZERO); // Here we add the first element of the Fibonacci sequence (0) to the ArrayList.
        fibonacci.add(BigInteger.ONE); // Here we add the second element of the Fibonacci sequence (1) to the ArrayList.

        for (int i = 2; i < fmax; i++) { // Just like in the method with a simple array,
            // The loop starts at 2 because the first two values have already been set,
            // and will run until (i) is less than the (fMax) random Number.

            fibonacci.add(fibonacci.get(i - 1).add(fibonacci.get(i - 2)));
        }
        return fibonacci;
    }

    //For more information about this function, please take a look at FibonacciRandom
    public static int countOddNumbers(ArrayList<BigInteger> fibonacci) {
        int count = 0;
        for (BigInteger number : fibonacci) {
            if (number.remainder(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0) {
                count++;
            }
        }
        return count;
    }

    //For more information about this function, please take a look at FibonacciRandom
    public static void printOddNumbers(ArrayList<BigInteger> fibonacci) {
        System.out.print("Odd numbers in the sequence: ");
        for (BigInteger number : fibonacci) {
            if (number.remainder(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0) {
                System.out.print(number + " ");
            }
        }
    }
}