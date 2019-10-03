class Lesson_4_Activity_Two{
 public static void main(String args[]){
	Scanner scan = new Scanner (System.in);
    String name;
    int age;
    int number;
    System.out.println("Hi there. What is your name?");
	name = scan.nextLine();
	System.out.println("Hi " + name + ". How old are you?");
    age = scan.nextInt();
    number = 100 - age;
    System.out.println(name +", you will be 100 in "+number + " years.");
 }   
    
}
