import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int a = scan.nextInt();
		if (a < 0){
			System.out.println("Negative");
		} else {
			System.out.println("Positive");
		}
	}
}
