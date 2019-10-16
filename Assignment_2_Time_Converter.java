import java.util.Scanner;
import java.lang.Math;

// seconds in a minute: 60
// minutes in a hour: 60
// hours in a day: 24
// days in a month: 30
// months in a year: 12

// seconds in a minute: 60
// seconds in a hour: 3600
// seconds in a day: 86400
// seconds in a month: 2592000
// seconds in a year: 31104000

class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("Seconds Since Unix Epoch:");
		int sec = scan.nextInt();
		
		int years = (sec/31104000) + 1970;
		int months = (sec % 31104000) / 2592000;
		int days = (sec % 2592000) / 86400;
		int hours = (sec % 86400) / 3600;
		int minutes = (sec % 3600)/ 60;
		int seconds = (sec % 60);


    System.out.println("Year: " + years);
    System.out.println("Month: " + months);
    System.out.println("Day: " + days);
    System.out.println("Hour: " + hours);
    System.out.println("Min: " + minutes);
    System.out.println("Sec: " + seconds);
		// System.out.println(sec);
  }
}
