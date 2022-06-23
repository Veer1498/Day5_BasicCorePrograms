package BasicCoreProg;
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s1 =new Scanner(System.in);
		Scanner s2 =new Scanner(System.in);
		Scanner s3 =new Scanner(System.in);
		System.out.println("Enter the value of A");
		a= s1.nextInt();
		System.out.println("Enter the value of B");
		b= s2.nextInt();
		System.out.println("Enter the value of C");
		c= s3.nextInt();
		if (a>b & a>c) {
			System.out.println( "Value A : "+a+" is Greater than B & C");
		}
		else if(c>b &c>a) {
			System.out.println( "Value C : "+c+" is Greater than A & B");
		}
		else
			System.out.println(" Value B : "+b+" is Greater than A & C");

	}

}
