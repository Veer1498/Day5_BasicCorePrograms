package BasicCoreProg;
import java.util.Scanner; //import the Scanner Class

public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0,k=0;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number times to flip");	
		int FlipNum = number.nextInt();
		System.out.println("Entered value is " +FlipNum);
		for(i=1;i<=FlipNum;i++) {
			int Percent = (int) Math.floor(Math.random()*2);
			if (Percent == 0) {
				System.out.println("The flip side is Tails");
				j++;
				}
			else {
				System.out.println("The flip side is Heads");
				k++;
				}
		}
		System.out.println("Number of tails is"+j);
		System.out.println("Number of Heads is"+k);
		float tails = (float) (j*100)/FlipNum;
		float heads = (float)(k*100)/FlipNum;
		System.out.println("percentage of tails is"+tails);
		System.out.println("percentage of Heads is"+heads);
	}
}
