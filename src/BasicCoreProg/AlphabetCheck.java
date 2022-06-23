package BasicCoreProg;
import java.util.Scanner;
public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Alphabet");
		char Alphabet = s.next().charAt(0);
		
		if (Alphabet == 'A' || Alphabet == 'a'||Alphabet == 'E'||Alphabet == 'e'||Alphabet == 'I'||Alphabet == 'i' ||Alphabet == 'O'||Alphabet == 'o'||Alphabet == 'U'||Alphabet == 'u') {
			System.out.println("The Letter - "+Alphabet+" is Vowel");
		}
		else {
			System.out.println("The Letter - "+Alphabet+" is Consonant");
		}

	}

}
