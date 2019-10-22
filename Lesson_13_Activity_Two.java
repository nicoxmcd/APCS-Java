import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int a = scan.nextInt();
		if (a >= 60){
			System.out.println("passing");
		} else {
			System.out.println("failing");
		}
	}
}
