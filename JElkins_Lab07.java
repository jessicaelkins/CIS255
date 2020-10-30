// STEP 2:  IDENTIFICATION COMMENTS GO HERE

import java.util.Scanner;
import java.text.DecimalFormat;

public class JElkins_Lab07
{
	public static void main(String[] args)
	{
		char size;
		int bars;
		double total;
		String input;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,##0.00");

		menu();
		// STEP 5:  CALL THE VOID METHOD HERE

		System.out.print("Enter your selection now: ");
		input = keyboard.nextLine();
		size = input.charAt(0);
		System.out.print("How many candy bars would you like? ");
		bars = keyboard.nextInt();

		total = totalPrice(size, bars);
		System.out.println("Your order total comes to $" + formatter.format(total) + ".");

		System.out.println("Please make your check payable to the school.  Thanks again!");
	}

	public static void menu()
	{
		System.out.println("Thank you for supporting our school! \nPlease choose a candy bar size:\n" +
						   "S = Small \nM = Medium \nL = Large");
	}

	public static double totalPrice(char size, int bars)
	{
		double price;

		if (size == 'S')
		{
			price = (double)bars * 2.50;
		}
		else if (size == 'M')
		{
			price = (double)bars * 3.75;
		}
		else if (size == 'L')
		{
			price = (double)bars * 5.00;
		}

		return price;
	}

	// STEP 4:  WRITE THE VOID METHOD DEFINITION HERE

	/* STEP 6:  WRITE THE VALUE-RETURNING METHOD DEFINITION HERE
				- HEADER:  RETURNS A REAL NUMBER, PARAMETERS FOR CHARACTER AND WHOLE NUMBER
				- DECLARE A LOCAL VARIABLE FOR THE TOTAL
				- USE IF STATEMENTS TO ASSIGN THE TOTAL BASED ON THE SIZE
				- RETURN THE TOTAL */
}