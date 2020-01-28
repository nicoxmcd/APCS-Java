
import java.util.Scanner;

class Lesson_34_Activity_Two {
// class Main {
   public static double average(int [] a)
    {
      int sum = 0;
    for (int i = 0; i < a.length; i++){
      sum += a[i];
    }
    double ave = (1.0) * (sum)/(a.length);
     return ave; 
    }
  
    public static void main(String[] args)
     {
       int list [] = {1,2,3,4};
       System.out.println((double)(average(list)));
    }
}
