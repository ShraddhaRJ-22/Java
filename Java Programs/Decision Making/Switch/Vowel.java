// Vowel & Consonant using Switch 
import java.util.Scanner;
class Vowel
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		switch(ch){
			case 'a','e','i','o','u' : System.out.println(ch + " is a Vowel");
			break;
			
			default : System.out.println(ch + " is a Consonant" );
			break;
		}
	}
}