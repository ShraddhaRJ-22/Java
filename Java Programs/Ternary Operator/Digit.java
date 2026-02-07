// Find Character Digit
import java.util.Scanner;
class Digit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
		
		String op = (ch >= '0' && ch <= '9') ? (ch + "is a digit") : (ch + "is not a digit");
		
		System.out.println(op);
	}
}