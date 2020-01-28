

import java.util.Scanner;

class Lesson_34_Activity_Four {
 // class Main {
   public static int findMin(int [] a)
    {
    int min = a[0];
    for (int i = 0; i < a.length; i++){
      if (a[i] < min)
        min = a[i];
    }
     return min; 
    }
  
    public static void main(String[] args)
     {
      int list [] = {1,2,3,4,5};
      System.out.println(findMin(list));
    }
}
