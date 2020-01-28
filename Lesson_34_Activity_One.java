
import java.util.Scanner;
//class Main {
class Lesson_34_Activity_One {
  
   public static int sum(int [] a)
    {
      int sums = 0;
      for (int i = 0; i < a.length; i++)
        sums += a[i];
     return sums; 
    }
  
    public static void main(String[] args)
     {
      int a []= {1,2,3,4};
      int x = sum(a);
      System.out.println(x);
    }
}
