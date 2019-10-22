import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_Four {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature? ");
		double a = scan.nextDouble();
		if (99 <= a || a >= 102){
			System.out.println("WARNING");
		} 
	}
}
