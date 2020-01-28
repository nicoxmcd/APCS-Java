import java.util.Scanner;

class Lesson_32_Activity_One {
      
         public static void monthName(int x){
             String Months[] = {"January","February","March","April","May","June","July","August","September","October","November", "December"};
             System.out.println(Months[x-1]);
         }
         
        
        public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
           int x = scan.nextInt();
           monthName(x);
         }
}
