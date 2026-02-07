// Prime
import java.util.Scanner;
class Prime
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int n = sc.nextInt();
		int i = 1;
		
		//String op = ((n >= 0 && n <= 100) && ((n % i != 0) || (n / n == 1))) ? (n + " is a Prime number") : (n + " is not a Prime number"): n+ " it is out of range";
		String j = n >= 0 && n <= 100 ?  ((n % i != 0) && (n / 2 == 1 || n / 3 == 1 || n / 5 == 1 || n / 7 == 1  ))? n+ " is prime" : n+ " is not prime"  : n+ " it is out of range";
		System.out.println(j);
	}
}