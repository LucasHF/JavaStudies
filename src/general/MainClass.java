package general;

import java.util.Scanner;


public class MainClass {
	
	public void Sum() { //Method to test basic sum
		int a, b, c;
		
		a = 10;
		b = 11;
		
		Scanner entries = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a = entries.nextInt();
		
		System.out.println("Enter the second number: ");
		b = entries.nextInt();
		
		c = a+b;
		
		System.out.println("The sum of the numbers is: "+c);
		
		System.out.println("Enter a new number to sum: ");
		c += entries.nextInt();
		
		System.out.println("The final numbers is: "+c);
		
		
		entries.close();
		
	}

	public void Bigger() { //Method to check bigger between two number
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
		
		System.out.println("The final numbers is: "+c);
		
		entries.close();
		
	}
	
	public static void main(String[] args) {
		
		int a=0;

		Scanner entries = new Scanner(System.in);
		
		System.out.println("Choose a number from 1 to 10");
		a = entries.nextInt();
		
		while( a!=3) { //There will be a loop until the user insert the number 3
			System.out.println("\n Wrong number!! Try another one!");
			a = entries.nextInt();
		}
		
		System.out.println("Great!! The right number is 3. You did it!");
		
		entries.close();
	}

}
