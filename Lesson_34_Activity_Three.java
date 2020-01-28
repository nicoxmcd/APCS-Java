

import java.util.Scanner;

class Lesson_34_Activity_Three {
//class Main {
   public static int findMax(int [] a)
    {
    int max = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] > max)
        max = a[i];
    }
     return max; 
    }
  
    public static void main(String[] args)
     {
      int list [] = {1,2,3,4,5};
     int x = findMax(list);
     System.out.println(x);
    }
}
