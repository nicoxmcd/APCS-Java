 
import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Six {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature? ");
		double a = scan.nextDouble();
		if (a < 99 || a > 102){
			System.out.println("WARNING");
		} else {
			System.out.println("Temperature is OK");
		}
	}
}
