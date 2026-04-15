import java.util.Scanner;
class Factorial
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		Factorial(n);
	}
	
	public static void Factorial(int n){
		
		int fact = 1;
		while(n >= 1){
			fact *= n;
			n--;
		}
		
		System.out.println("Factorial = " + fact);
	}
	
}