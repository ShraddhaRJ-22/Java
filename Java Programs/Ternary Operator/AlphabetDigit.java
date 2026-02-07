// Check Alphabet ,digit ot not
import java.util.Scanner;
class AlphabetDigit
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
	
		char ch = sc.next().charAt(0);
		
		String op = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? ((ch >= 65 && ch <= 90) ? (ch + " is UPPER CASE") : (ch + " is lower case")) : ((ch >= 48 && ch <= 57) ? (ch + " is Digit") : (ch + " is not a Digit"));
		
		System.out.println(op);
	}
}