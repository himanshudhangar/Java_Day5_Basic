
package Basic_java;
import java.util.Scanner;
public class Power_Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,p,result=1;
		System.out.println("Enetr No");
		Scanner r=new Scanner(System.in) ;
		n=r.nextInt();
		System.out.print("Enter Power");
		p=r.nextInt();
		for(int i=1;i<=p;i++) {
			result=n*result;
		}
		System.out.print("power" +result);
		

	}

}
