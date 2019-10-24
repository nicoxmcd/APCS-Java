import java.util.Scanner;
import java.lang.Math;

// Test if an integer is not between 5 and 76 inclusive.


class Lesson_14_Activity_One{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = scan.nextInt();
		if (x < 5 || x > 76){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
