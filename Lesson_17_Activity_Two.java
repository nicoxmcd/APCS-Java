import java.util.Scanner;
import java.lang.Math;

class Lesson_17_Activity_Two {
  public static void main (String str[]){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		// int x = a;
  
	  for (int i=a; i<=b; i++) {
      if (i % 2 == 0) {
        System.out.print(i+" ");
      }
    }
  }
}
