// Jessie Elkins
// CIS 255
// Laboratory Assignment 6
// February 28, 2018
// In this assignment, I am practicing Java concepts such as
// declairing variables, Scanner input and output,
// decision structures, Programmer-Defined Methods, and Parameters.

import java.util.Scanner;

public class JElkins_Lab06
{
	public static void main(String[] args)
	{
		//Declairing my Scanner object and variable to store user input
		int userChoice;
		Scanner keyboard = new Scanner(System.in);

		// Getting state input from the user
		System.out.print("Choose from the following states:\n1. Alabama \n2. Ohio \n3. Florida\n" +
						"Enter your selection now: ");
		userChoice = keyboard.nextInt();

		nickname(userChoice);
	}

	public static void nickname(int state)
	{
		// Decision structure to determine the nickname to display based on user input
		if (state == 1)
		{
			System.out.println("The Yellowhammer State");
		}
		else if (state == 2)
		{
			System.out.println("The Buckeye State");
		}
		else if (state == 3)
		{
			System.out.println("The Sunshine State");
		}
		else
		{
			System.out.println("Error. Please choose from 1, 2, or 3.");
		}

	}

}