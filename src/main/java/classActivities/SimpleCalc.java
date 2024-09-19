package demo;

import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        //creating a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //prompting the user to enter the first number
        System.out.println("Enter your first number : ");

        double num1 = scanner.nextInt();

        //prompting the user to enter the second number
        System.out.println("Enter your second number : ");

        //reading the second number
        double num2 = scanner.nextInt();
//
//        //prompting the user to enter an operator
//        System.out.println("Enter an operator : ");
//
//        //reading the operator
//        char operator = scanner.next().charAt(0);
//
//        double output = 0;
//
//        //perform operation
//        if (operator == '+'){
//            output = num1 + num2;
//        } else if (operator == '-'){
//            output = num1 - num2;
//        } else if (operator == '*'){
//            output = num1 * num2;
//        } else if (operator == '/'){
//            output = num1/num2;
//        }
        //printing the total sum

        //perform tasks
        double addition = num1+num2;
        double subtraction = num1-num2;
        double multiplication = num1*num2;
        double division = num1/num2;

//        System.out.println("Addition: " + addition)+ "\nSubtraction: " + subtraction + "\nMultiplication: " + multiplication + "\nDivision: "+ division );

        //close the scanner object
        scanner.close();
    }
}
