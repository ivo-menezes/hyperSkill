import java.util.Scanner;

// highest number inserted until input of 0
class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start coding here
        int max = Integer.MIN_VALUE; // Initialize max to smallest possible integer

        while (true) {
            int num = scanner.nextInt(); // Read the next integer
            if (num == 0) // If the input is 0, exit the loop
                break;
            if (num > max) // Update max if the current number is greater
                max = num;
        }

        System.out.println(max); // Print the maximum element
    }
}