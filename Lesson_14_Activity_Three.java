import java.util.Scanner;
import java.lang.Math;

class Lesson_14_Activity_Three{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first octet:");
		int first = scan.nextInt();
		System.out.println("Please enter the second octet:");
		int second = scan.nextInt();
		System.out.println("Please enter the third octet:");
		int third = scan.nextInt();
		System.out.println("Please enter the fourth octet:");
		int fourth = scan.nextInt();

		int wrong = 0;

		if (!(first >= 0 && first <= 255)){
			System.out.println("Octet 1 is incorrect");
			wrong++;
		}
		if (!(second >= 0 && second <= 255)){
			System.out.println("Octet 2 is incorrect");
			wrong++;
		}
		if (!(third >= 0 && third <= 255)){
			System.out.println("Octet 3 is incorrect");
			wrong++;

		}
		if (!(fourth >= 0 && fourth <= 255)){
			System.out.println("Octet 4 is incorrect");
			wrong++;
		} 
		
		if (wrong == 0) {
			System.out.println("IP Address: " + first + "." + second + "." + third + "." + fourth);
		}
	}
}
