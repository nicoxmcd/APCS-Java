 
import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b){
			System.out.println(a);
		} else if (b > a){
			System.out.println( b);
		} else {
			System.out.println("EQUAL");

		}
	}
}
