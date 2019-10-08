import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String args[]){
        double average_website;
	    double average_focus;
        double overall;
        Scanner scan = new Scanner(System.in);
	   
        System.out.println("Please enter ratings from the movie review website.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        //input focus group
        System.out.println("Please enter ratings from the focus group.");
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        
        //critic rating input
        System.out.println("Please enter the average movie critic rating.");
        double average_critic = scan.nextDouble();

        
        average_website = ((double)a + (double)b + (double)c)/3;
        average_focus = (m+n)/2;
        overall = (0.2*average_website) + (0.3*average_focus) + (0.5*average_critic);
        
        //printing the averages
        System.out.println("Average website rating: " + average_website);
        System.out.println("Average focus group rating: " + average_focus);
        System.out.println("Average movie critic rating: " + average_critic);
        System.out.println("Overall movie rating: " + overall);
        
    }   
    
}
