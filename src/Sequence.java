import java.util.Scanner;
public class Sequence {
// first you imput the number of elements to evaluate, and then it evaluates the highest number divisible by 4
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // start coding here
            int n = scanner.nextInt(); // Read the total number of elements
            int maxDivisible = Integer.MIN_VALUE; // Initialize the maximum divisible number to negative infinity

            int count = 0; // Counter to keep track of the number of elements processed
            while (count < n) {
                int num = scanner.nextInt(); // Read the next number in the sequence
                if (num % 4 == 0 && num > maxDivisible) { // Check if the number is divisible by 4 and greater than the current maximum
                    maxDivisible = num; // Update the maximum divisible number
                }
                count++; // Increment the counter
            }

            System.out.println(maxDivisible); // Print the maximum divisible number
        }
    }

