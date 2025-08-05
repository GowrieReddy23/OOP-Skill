package Skill2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        String inputString;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputString = sc.nextLine();

        System.out.println("Character array as string: " + new String(charArray));
        System.out.println("User-entered string: " + inputString);

        String convertedString = new String(charArray);
        System.out.println("Converted String from char array: " + convertedString);

        sc.close();
    }
}