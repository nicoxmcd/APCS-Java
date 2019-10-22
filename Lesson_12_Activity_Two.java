import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		if (a > b){
			System.out.println("Largest is: " + a);
		} else if (b > a){
			System.out.println("Largest is: " + b);
		} else {
			System.out.println("Largest is: " + a);

		}
	}
}
