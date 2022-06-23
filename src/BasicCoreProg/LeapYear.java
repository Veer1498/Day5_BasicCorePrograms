package BasicCoreProg;
import java.util.Scanner;

public class LeapYear {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner year = new Scanner(System.in);
		System.out.println("Enter the Year");
		int Year = year.nextInt();
		System.out.println("Enered Year ="+Year);
		if (Year % 4 ==0   ) {
			if(Year %400 ==0 ) {
				if (Year % 100 ==0) {
					System.out.println("The year" +Year+"is Leap Year");
	
				}
			}			
		}
		else
			System.out.println("The year " +Year+" is Not Leap Year");	
	}

}
