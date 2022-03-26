package Basic_java;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		int y;
		System.out.println("Enter The year");
		Scanner r= new Scanner(System.in);
		y=r.nextInt();
		if(y%100!=0 && y%4==0) {
			System.out.println("Leap lear");
		}
		else {
			System.out.print("Not Leap year");
		}
	}
	

}
