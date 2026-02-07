// Find whether is it an Alphabet or not
import java.util.Scanner;
class Alphabet
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
		
		String op = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? (ch + "is an Alphabet") : (ch + "is not an Alphabet");
		
		System.out.println(op);
	}
}