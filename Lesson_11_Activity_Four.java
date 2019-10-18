import java.util.Scanner;
import java.lang.Math;

class Lesson_11_Activity_Four {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int inin = scan.nextInt();
		int test = inin%2;
		if(test == 0){
			System.out.println("Even");
		} else {
		    System.out.println("Odd");
		}
	}
}
