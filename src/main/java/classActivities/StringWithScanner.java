package classActivities;

import java.util.Scanner;

public class StringWithScanner {

    public static void main(String[] args) {


        //creating a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //prompting the user to enter the first name
        System.out.println("Enter your first name : ");

        //reading the first name
        String firstName = scanner.nextLine();

        //prompting the user to enter the last name
        System.out.println("Enter your last name : ");

        //reading the last name
        String lastName = scanner.nextLine();

        //printing the name
        System.out.println("Your name is " + firstName +" " + lastName);

        //close the scanner object
        scanner.close();
    }
}
