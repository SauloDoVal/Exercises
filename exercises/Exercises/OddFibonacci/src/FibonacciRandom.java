import java.util.Random;

public class FibonacciRandom {
    public static void main(String[] args) {
        //Generate a random number from 1 to 100
        int randomNumb = getRandomNumberInRange(1, 10000);
        System.out.println("Random number generated from 1 to 100: " + randomNumb);

        //Generate the Fibonacci sequence up to the random number
        int[] fibonacci = generateFibonacci(randomNumb);

        //Calculate a number of odd numbers in the Fibonacci sequence
        int oddCount = countOddNumbers(fibonacci);
        System.out.println("Number of odd numbers in the sequence: " + oddCount);

        //Prints the Odd numbers in the sequence
        printOddNumbers(fibonacci);
    }

/////////////////////////////////////////////RANDOM/////////////////////////////////////////////////////////////////////

/*Part of the java.util package, an instance of java Random class is used to generate random numbers.
This class provides several methods to generate random numbers of type integer, double, long, float etc. */

    public static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();  // This line creates a new instance of the Random class.
        return rand.nextInt((max - min) + 1) + min; // This line generates a random integer value within the range of min to max.
    }
/* The nextInt method generates a random integer value between 0 (inclusive) and the specified value (exclusive).
In this case, the value is (max - min) + 1 which means that it generates a random integer between 0 and (max - min) + 1 */



/////////////////////////////////////////////FIBONACCI///////////////////////////////////////////////////////////////////
/*According to Wikipedia: In mathematics, the Fibonacci numbers, form a sequence, the Fibonacci sequence,
 in which each number is the sum of the two preceding ones
 the 2 is found by adding the two numbers before it (1+1),
 the 3 is found by adding the two numbers before it (1+2),
 the 5 is (2+3),
 and so on! */

/* The generateFibonacci function is a method that generates the Fibonacci sequence
up to a given maximum value of our sequence (fMax), our random number. */

    public static int[] generateFibonacci(int fMax) {
        int[] fibonacci = new int[fMax]; /* This line creates an array called fibonacci with a size of our random Number.
        The array will be used to store the values of the Fibonacci sequence. */

        /*These lines below set the first two values of the Fibonacci sequence, 0 and 1, to the first two elements of the array.
         These values are the seed values for the sequence. */
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        /* Below we have a for loop that will be used to generate the rest of the values of the Fibonacci sequence.
        The loop starts at 2 because the first two values have already been set, and will run until (i) is less than the (fMax) random Number. */
        for (int i = 2; i < fMax; i++) {
       //Inside the for loop, the line below generates the next value in the Fibonacci sequence by adding the previous two values in the sequence.
       //The value of fibonacci[i] is set to the sum of fibonacci[i - 1] and fibonacci[i - 2].
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
       /*
       fibonacci[i - 1]: This refers to the value stored in the fibonacci array at the index i-1.
       It represents the previous value in the Fibonacci sequence.
       fibonacci[i - 2]: This refers to the value stored in the fibonacci array at the index i-2.
       It represents the value before the previous value in the Fibonacci sequence.
       fibonacci[i - 1] + fibonacci[i - 2]: Is the sum of the previous two values in the Fibonacci sequence.
       According to the Fibonacci sequence definition, each number is the sum of the two preceding ones,
       so this line is used to generate the next value in the sequence by adding the previous two values.
       The sum of the previous two values in the Fibonacci sequence will be stored in the array fibonacci[i]
        */
        }
        //Finally, the function returns the fibonacci array containing the entire Fibonacci sequence till fMax.
        return fibonacci;
    }

/////////////////////////////////////////////ODD-NUMBERS COUNTER////////////////////////////////////////////////////////

//This is a method that counts the number of odd numbers in an array of integers (in this case, the Fibonacci sequence).
    public static int countOddNumbers(int[] fibonacci) {
        int count = 0; // This variable will be used to keep track of the number of odd numbers found in the array.

        /*
        Below we have a for-each loop that will iterate through each element of the fibonacci array.
        The variable number is used to reference the current element of the array during each iteration of the loop.
         */
        for (int number : fibonacci) {
            if (number % 2 != 0) { //  This line checks if the current element of the array (number) is odd.
                // It does this by checking if the remainder of the element divided by 2 is not equal to 0.
                // If the remainder is not equal to 0, it means that the number is odd.

                count++; //If the current element of the array is odd (the if statement evaluates to true),
                // this line increments the count variable by 1.
            }
        }
        return count;  //At the end it returns the count variable, which holds the total number of odd numbers found in the array.
    }

    /////////////////////////////////////////////ODD-NUMBERS PRINTER////////////////////////////////////////////////////////

    public static void printOddNumbers(int[] fibonacci) {
        System.out.print("The Odd numbers in the sequence: ");
        for (int number : fibonacci) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }






}
