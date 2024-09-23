package demo;

import java.util.Scanner;

public class ClassActivity1 {

    public static void main(String[] args) {

        //creating a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //prompting the user to enter the first number
        System.out.println("Enter your first number : ");

        int num1 = scanner.nextInt();

        //prompting the user to enter the second number
        System.out.println("Enter your second number : ");

        //reading the second number
        int num2 = scanner.nextInt();

        //summing the first and second number
        int totalSum = num1 + num2;

        //printing the total sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + totalSum);

        //close the scanner object
        scanner.close();
    }
}
