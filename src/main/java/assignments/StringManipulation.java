package assignments;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        //enable user to input string
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();

        //convert string to uppercase
        String upperCase = userString.toUpperCase();
        System.out.println("String entered in uppercase is " + upperCase);

        //reverse the string
        String reversedString = "";
        int userStringLength = userString.length();

        for (int i = userStringLength-1; i>=0; i-- ){
//            reversedString = reversedString + userString.charAt(i);
            reversedString += userString.charAt(i);
        }
        System.out.println("String reversed is " + reversedString);

        //count the number of vowels in the string
        int count = 0;
        for (int i = 0; i < userString.length(); i++){
            char character = userString.charAt(i);
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string is " + count);

        //check if string is palindrome
        if(reversedString.equals(userString)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        scanner.close();
    }
}
