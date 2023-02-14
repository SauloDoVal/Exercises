import java.util.ArrayList;
import java.util.Random;

public class FibonacciArrayListRandom {

    public static void main(String[] args) {
        //Generate a random number from 1 to 100
        int max = getRandomNumberInRange(1, 1000);
        //Generate the Fibonacci sequence up to a random from 1 to 1000 and store it in the arraylist
        ArrayList<Integer> fibonacci = generateFibonacci(max);
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

    public static ArrayList<Integer> generateFibonacci(int fmax) {
        //The line below declares and initializes an ArrayList called fibonacci to store the sequence.
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0); // Here we add the first element of the Fibonacci sequence (0) to the ArrayList.
        fibonacci.add(1); // Here we add the second element of the Fibonacci sequence (1) to the ArrayList.

        for (int i = 2; i < fmax; i++) { // Just like in the method with a simple array,
        // The loop starts at 2 because the first two values have already been set,
        // and will run until (i) is less than the (fMax) random Number.

            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }
        return fibonacci;
    }

    //For more information about this function, please take a look at FibonacciRandom
    public static int countOddNumbers(ArrayList<Integer> fibonacci) {
        int count = 0;
        for (int number : fibonacci) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //For more information about this function, please take a look at FibonacciRandom
    public static void printOddNumbers(ArrayList<Integer> fibonacci) {
        System.out.print("Odd numbers in the sequence: ");
        for (int number : fibonacci) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}


