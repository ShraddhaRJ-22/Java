// Find Special Character
import java.util.Scanner;
class FindSpecialChar
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		
		char ch = sc.next().charAt(0);
		
		String op = ((ch >= 0 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >=91 && ch <= 96) || (ch >= 123 && ch <= 127)) ? (ch + " is a Special character") : (ch + " is not a Special character");
		System.out.println(op);
	}
}