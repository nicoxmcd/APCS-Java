import java.util.Scanner;

class Lesson_34_Activity_Six {

  public static boolean allPositive(int [] a)
    {
      int flag = 0;
    for (int i = 0; i < a.length; i++){
      if (!(a[i] >= 0))
        flag = 1;
    }
    if (flag == 0)
            return true;
     return false; 
    }
  
    public static void main(String[] args)
     {
     int list [] = {-11,2,3,4,5};
     System.out.println(allPositive(list));
    }
}
