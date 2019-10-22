 
import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Four {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a score");
		int a = scan.nextInt();
		if (a == 0){
			System.out.println("F");
		} else if (a == 1){
			System.out.println("D");
		} else if (a == 2){
			System.out.println("C");
		}else if ( a == 3){
			System.out.println("B");
		}else {
			System.out.println("A");

		}
	}
}
