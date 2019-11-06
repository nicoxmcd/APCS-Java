import java.util.Scanner;
import java.lang.Math;


class Lesson_24_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 100:");
    int input = scan.nextInt();
    if (input < 0 || input > 100) {
      System.out.println("error");
    } else {
      for (int i = input; i <= 100; i++) {
        System.out.print(i + " ");
        if (0 == (i - input + 1) % 20) {
          System.out.println("");
        }
      }
    }
  }
}
