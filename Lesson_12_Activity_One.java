import java.util.Scanner;
import java.lang.Math;

class Lesson_12_Activity_One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 3 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double d = ((double)(a + b + c))/3;
		if (d >= 89.5){
			System.out.println("ABOVE AVERAGE");
		}
	}
}
