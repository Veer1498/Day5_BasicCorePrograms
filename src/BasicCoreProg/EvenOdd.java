package BasicCoreProg;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter The Number");
		Scanner s = new Scanner(System.in);
		num =s.nextInt();
		if (num == 0) {
			System.out.println("Entered Number is invalid (0)");
		}
		else if (num % 2 == 0){
			System.out.println("The Number is Even");
		}
		else {
			System.out.println("The Numebr is Odd");
		}
	}

}
