import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num != 0) // if the number is not equal to zero, count it
                count++;
            else
                break; // exit the loop when zero is encountered
        }
        System.out.print(count); // print the count after the loop ends
    }
}