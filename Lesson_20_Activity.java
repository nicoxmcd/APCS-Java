
import java.util.Scanner;
import java.lang.Math;

class Lesson_20_Activity {
  public static void main (String str[]){
		Scanner scan = new Scanner(System.in);
		int control = 0;
		// above contrtols the variable that stops the loop
		// int flag = 1;
		double lon = 0; 
		double lat = 0; 
		double north = -90;
		double east = -180;
		double south = 90;
		double west = 180; 
	
	//   if(num > max){
  //   max = num;
  // }

		while(control != 1){
			System.out.println("Please enter the latitude:");
			lat = scan.nextDouble();

			System.out.println("Please enter the longitude:");
			lon = scan.nextDouble();
			
			if ((lat < -90 || lat > 90) || (lon < -180 || lon > 180)){
				System.out.println("Incorrect Latitude or Longitude");			
			} else {
					if (lat > north){
						north = lat;
					}
					if (lat < south){
						south = lat;
					}
					if (lon > east){
						east = lon;
					} 
					if (lon < west){
						west = lon;
					}
					System.out.println("Would you like to enter another location?");
					int again = scan.nextInt();
					if (again == 0){
						control ++;
					}
			}
		}

		System.out.println("Farthest North: " + north);
		System.out.println("Farthest South: " + south);
		System.out.println("Farthest East: " + east);
		System.out.println("Farthest West: " + west);
  }
}
