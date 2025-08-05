package Skill1;

import java.util.Scanner;

public class Narrowingtype {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        
        int intValue = (int) doubleValue;
        
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        
        scanner.close();
    }
}