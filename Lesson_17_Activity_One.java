
import java.util.Scanner;
import java.lang.Math;

class Lesson_17_Activity_One {
  public static void main (String str[]){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the Scores:");
    	int x = 0;
      int c = 0; 
      int sum = 0; 
      while ( x != -1 ){
        x = scan.nextInt();
      	sum = sum + x; 
        c ++;
      }
      c --;
      sum ++;
            
      System.out.println( "The average is " + (1.0*sum/c));
        
            
  }
}
