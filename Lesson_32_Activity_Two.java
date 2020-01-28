
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Lesson_32_Activity_Two {
    
  //monthDays(int n) method
  public static void monthDays(int n) {
    if (n == 2) {
      System.out.println("28");
    }
      
    else if (n == 4 || n == 6 || n == 9 || n == 11) {
      System.out.println("30");
    }
      
    else {
      System.out.println("31");
    }
  }
    
  //Main
  public static void main (String str[]) throws IOException {
    Scanner scan = new Scanner (System.in);
  
    System.out.println("Enter the number of a month: ");
    int monthNumber = scan.nextInt();
    
    monthDays(monthNumber);
  }
}
