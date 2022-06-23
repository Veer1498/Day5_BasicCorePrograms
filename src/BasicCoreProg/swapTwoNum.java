package BasicCoreProg;
import java.util.Scanner;

public class swapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println(" Enter The Value of A & B ");
		a= s1.nextInt();
		b= s2.nextInt();
		System.out.println(" The Value of A ="+a+" The Value of B = "+b);
		c = a;
		a = b;
		b = c;
		System.out.println(" The Value of A ="+a+" The Value of B = "+b);
	}

}
