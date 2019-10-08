import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One{
    public static void main(String args[]){
        int hundred;
        int ten;
        int one;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int whole = scan.nextInt();
        
        hundred = whole / 100;
        ten = (whole % 100)/10;
        one = (whole % 100)% 10 ;
        
        System.out.println("Here are the digits:\n"+hundred+"\n"+ten+"\n"+one);
        
    }
}
