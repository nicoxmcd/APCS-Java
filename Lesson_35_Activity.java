
import java.util.Scanner;

class Lesson_35_Activity {
    public static int randomize(int a, int b)
    {
      int min = 0;
      int max = 0;
      int random = 0;
      if(a>b){
        max = a;
        min = b;
      }
      else{ 
        max = b;
        min = a;
      }
      random = (int)(Math.random()*((max-min) + 1) + min);
      return random;
      
    }
   
     
     public static int randomize(int a)
    {
    int random = 0;
    random = (int)(Math.random()*(a+1));
    return random;
    }
    
  
    public static double randomize(double a, double b)
    {
      double max = 0;
      double min = 0;
      double random = 0;
      if(a>b){
        max = a;
        min = b;
      }
      else{
        max = b;
        min = a;
      }
      random = (Math.random()*((max-min)) + min);
      return random;
    }    
    
  public static double randomize(double a)
    {
    double random = 0;
    random = (int)(Math.random()*(a+1));
    return random;
    }

    
     
    public static void main(String[] args)
     {
        System.out.println(randomize(2.0,7.0));
    }
}
