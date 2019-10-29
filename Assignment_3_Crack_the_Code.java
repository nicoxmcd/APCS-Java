
import java.util.Scanner;
import java.lang.Math;

// The first number must be the number 3.
// The second number can either be the number 1 or be between 33 and 100, inclusive.
// The third number must be a positive number that is either evenly divisible by 3 or evenly divisible by 7

// As the user enters each number, the program should immediately check whether or not the number satisfies its respective requirement(s) listed above. If the requirement(s) is satisfied, then a “Correct!” confirmation should be printed out. If the requirement(s) is NOT satisfied, then an error message should be printed out, and the user cannot input any more numbers. (i.e. if the user input 5 as the first number, then the user has failed to crack the code, and cannot guess the second or third number.)

// Please refer to the sample outputs below for formatting. (Any output statements from the program must match the sample formatting exactly.)

class Assignment_3_Crack_the_Code {
	public static void main(String str[]) {
		Scanner scan = new Scanner(System.in);
		//greeting
		System.out.println("Welcome. What is your name?");
		String name = scan.nextLine();
		//ending the greeting, start of phase 1
		System.out.println("Hello " + name + ". Try your best to crack the code!\n\nPHASE 1\nEnter a number:");
		
		int phase_one = scan.nextInt();
		if (phase_one == 3){
			System.out.println("Correct!\n\nPHASE 2\nEnter a number:");
			int phase_two = scan.nextInt();
			if (phase_two == 1 || (phase_two >= 33 && phase_two <= 100)){
				System.out.println("Correct!\n\nPHASE 3\nEnter a number:");
				int phase_three = scan.nextInt();
				if (phase_three > 0 && (phase_three % 3 == 0 || phase_three % 7 == 0)){
					System.out.println("Correct!\nYou have cracked the code!");
				} else {
					System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
				}
			} else {
				System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
			}
		} else {
			System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
		}
	}
}
