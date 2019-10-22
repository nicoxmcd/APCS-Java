import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Five {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = (int)(Math.random() * ((12 - 1) + 1)) + 1;
		int b = (int)(Math.random() * ((12 - 1) + 1)) + 1;
		int c = a * b;
		System.out.println("Multiply these numbers:");
		System.out.println(a);
		System.out.println(b);
		int user = scan.nextInt();
		if (user == c){
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
	}
}
