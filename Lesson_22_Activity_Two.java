import java.util.Scanner;
import java.lang.Math;

class Lesson_22_Activity_Two{
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String word = scan.nextLine();
		int x = word.length();
		int a = 0;
		String tab = "";
		while (a != x){
			System.out.println(tab + word.charAt(a));
			tab = tab + "\t";
			a++;
		}




  }
}
