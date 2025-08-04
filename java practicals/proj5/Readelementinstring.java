package hello;

import java.util.Scanner;

public class Readelementinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(" entered value of string is: " + input);
        sc.close();
    }
}
