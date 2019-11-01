import java.util.Scanner;
import java.lang.Math;

class Lesson_22_Activity_One {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String word = scan.nextLine();
		int x = word.length();
		int a = 0;
		while (a != x){
			System.out.println(word.charAt(a));
			a++;
		}
  }
}
