class Lesson_6_Activity_One{
    public static void main(String args[]){
	    Scanner scan = new Scanner (System.in);
        int x;
        int y;
        double z;
        System.out.println("Please enter two integers:");
        x = scan.nextInt();
        y = scan.nextInt();
        z = ((double)x + (double)y) / 2; 
        System.out.println("The average is: " + z);
        
 }   
    
}
