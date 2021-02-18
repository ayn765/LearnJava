package practice;

import java.util.Scanner;

public class ScannerName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name");
        String first = scanner.nextLine();

        System.out.println("Enter Last Name");
        String last = scanner.nextLine();

        System.out.println("First and Last names are: " + first + " " + last);

        scanner.close();
    }
}
