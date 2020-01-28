import java.util.Scanner;

class Lesson_33_Activity_Five {
  
    public static void insertValue(int[] intarray, int value, int index){
      
      for(int i = (intarray.length-1); i > index; i--){
        intarray[i]= intarray[(i-1)];
      }
      
      intarray[index] = value;
      
    }
  
    public static void main(String[] args)
     {

        int[] numbers = {1,2,3,4,5,6};
        
        insertValue(numbers, 2, 2);
        
        for(int i = 0; i < numbers.length; i++){
          System.out.println(numbers[i]);
        }

    }
}
