import java.util.Scanner;
import java.lang.Math;

class Lesson_10_Activity {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two decimal values:");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		int xx = (int)(1000*x);
		int yy = (int)(1000*y);
		double xy = xx - yy;
		double newxy = xy/1000;
		System.out.println("The difference is: " + newxy);
	}
}
