package BasicCoreProg;
import java.util.Scanner;

public class PowerOf_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number N :");
		int N = s.nextInt();
			for ( int i=1;i<=N;i++) {
				if (N<31) {
					System.out.println("2 X "+ i +"=" + 2*i);
				}
			}
	}
}
