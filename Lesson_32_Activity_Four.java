import java.util.Scanner;

class Main {
      
    public static void realTime(int x){
int hours = (x/3600);
int minutes = (x%3600)/60;
int seconds = (x%3600)%60;

System.out.print("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);

    }
        public static void main(String[] args)
        {
 Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
realTime(x);


        }
}
