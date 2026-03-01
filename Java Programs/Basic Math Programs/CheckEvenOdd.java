// Check even or odd
import java.util.Scanner;
class CheckEvenOdd
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		
		int num = sc.nextInt();
		
		String ans = (num % 2 == 0) ? "Even number" : "Odd Number";
		System.out.println(ans);
	}
}