// Upper case & Lower case 
import java.util.Scanner;
class UpperLowerCase
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		
		char ch = sc.next().charAt(0);
		
		String op = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? ((ch >= 65 && ch <= 90) ? (ch + " is UPPER CASE") : (ch + " is lower case")) : (ch + " is not an Alphabet");
		
		System.out.println(op);
	}
	
}