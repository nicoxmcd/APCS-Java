import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_Three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a test score: ");
		double a = scan.nextDouble();
		if (0 <= a && a <= 100){
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}

		
	}
}
