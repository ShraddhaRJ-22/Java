// Check for vowel or Consonant using if and else
import java.util.Scanner;
class IfVowel
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet: ");
		
		char ch = sc.next().charAt(0);
		if(ch >= 65 && ch<= 90 || ch >= 97 && ch <= 122){
			if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U')
			{
				System.out.println("Entered Alphabet is a Vowel");
			} else {
			System.out.println("Entered Alphabet is a Consonant");
			}
		} else {
		System.out.println("Enter character is not an Alphabet");
		}
	}
}