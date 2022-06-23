package BasicCoreProg;
import java.util.Scanner;
public class ComputeQuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divident,divisor,remainder,quotient;
		System.out.println("Enter the Values Divident & Divisor");
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		divident = s1.nextInt();
		divisor = s2.nextInt();
		remainder = divident % divisor;
		quotient =divident / divisor;
		System.out.println("The Remainder is "+remainder+" The Quotient is "+quotient);
	}

}
