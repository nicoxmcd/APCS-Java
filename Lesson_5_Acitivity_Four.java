class Lesson_5_Activity_Four{
    public static void main(String args[]){
	    Scanner scan = new Scanner (System.in);
        double price;
        double change;
        System.out.println("Enter a price:");
	    price = scan.nextDouble();
        change = 20 - price;
        System.out.println("Change from $20: $"+change);
        
 }   
    
}
