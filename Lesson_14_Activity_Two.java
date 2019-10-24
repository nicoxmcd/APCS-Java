import java.util.Scanner;
import java.lang.Math;

// Test if an integer is not between 5 and 76 inclusive.


class Lesson_14_Activity_Two{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a >= 0 && b >= 0){
			System.out.println("Both are positive or zero.");
		} else {
			System.out.println("One or both are negative.");
		}
	}
}

//Write a program to input two integers and
//  print "Both are positive or zero." to the screen, 
// if both are positive or zero. 
// Print "One or both are negative." otherwise.
