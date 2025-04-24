package exploringJavaConcepts;

import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        //Part 3: Working with Strings and User Input
        System.out.println("Part 3: Working with Strings and User Input ----");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        String fullName = firstName + " " + lastName;
        String fullNameCaps = fullName.toUpperCase();

        //Count the number of times the first character of fullName appears throughout the String
        int letterAppearances = 1;
        char firstLetter = fullName.charAt(0);
        for(int i = 1 ; i < fullName.length() ; i++){
            if(firstLetter == fullName.charAt(i)){
                letterAppearances++;
            }
        }

        System.out.printf("Full Name: %s \n" ,fullName);
        System.out.printf("FULL NAME: %s \n" ,fullNameCaps);
        System.out.printf("Initial appearances: %s \n" ,letterAppearances);

    }
}
