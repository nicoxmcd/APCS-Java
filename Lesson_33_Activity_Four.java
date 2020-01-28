
import java.util.Scanner;

class Lesson_33_Activity_Four {
  
    public static void reverse(int list[]){
      int[] newArray = new int[list.length];
      for(int i=0; i<list.length;i++){
      newArray[i]=list[i];
      }
      for(int y=0; y<list.length;y++){
        list[y]=newArray[list.length-(y+1)];
      }
    }
    public static void main(String[] args)
     {
     int [] list = {1,2,3,4,5,6};
     reverse(list);
     for (int x=0; x < list.length; x++){
     System.out.print(list[x] + " ");
     }
    }
}
