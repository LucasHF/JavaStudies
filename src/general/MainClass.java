package general;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int a, b, c;
		
		a = 10;
		b = 11;
		
		Scanner entries = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a = entries.nextInt();
		
		System.out.println("Enter the second number: ");
		b = entries.nextInt();
		
		c = a+b;
		
		if(a>b) {
			System.out.println("The first number is the bigger!\n");			
		}else if (b>a) {
			System.out.println("The second number is the bigger!\n");
		}else {
			System.out.println("Equal numbers inserted! \n");
		}
		
		/* SIMPLE FUNCTION TO SUM AND ADD UP AT THE END
		 * System.out.println("The sum of the numbers is: "+c);
		
		System.out.println("Enter a new number to sum: ");
		c += entries.nextInt();*/
		
		System.out.println("The final numbers is: "+c);
		
		
		entries.close();

	}

}
