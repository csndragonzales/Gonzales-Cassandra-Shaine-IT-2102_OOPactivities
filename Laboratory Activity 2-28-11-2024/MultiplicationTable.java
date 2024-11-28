import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int maxNumber = scanner.nextInt();

        // No need for a separate array; directly print results
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
