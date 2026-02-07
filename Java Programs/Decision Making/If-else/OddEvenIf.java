// Check whether the number is odd or even using if and else
import java.util.Scanner;
class OddEvenIf
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " Entered integer is an Even number");
		} else {
			System.out.println(n + " Entered integer is an Odd number");
		}
	}
}