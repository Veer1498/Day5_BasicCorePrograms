package BasicCoreProg;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		Num =s.nextInt();
		for (i= 2;i<=Num;i++ ) {
			while(Num % i==0) {
				System.out.println(i+"");
				Num=Num/i;
			}			
		}
		if(Num>2)
			System.out.println(Num+" ");

	}

}
