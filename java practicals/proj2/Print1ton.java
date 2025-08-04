package hello;

import java.util.Scanner;

public class Print1ton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Print numbers from 1 to n
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
