package BasicCoreProg;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res=0,hNum =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num = s.nextInt();
		System.out.println("The Harmonic Series is ");
		for ( int i=1;i<=Num;i++) {
			hNum = (double)1/i;
			System.out.println(hNum);
			res+=hNum;
		}
		System.out.println("The Sum of Harmonic Numbers is "+res);
	}

}
