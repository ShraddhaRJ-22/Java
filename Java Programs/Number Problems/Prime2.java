// Prime 2
import java.util.Scanner;
class Prime2
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		if(isPrime(n)){
			System.out.println(n + " is a Prime Number.");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
	}
	
	public static boolean isPrime(int n){
		int den = 2;
		while(den < n){
			if(n % den == 0){
				return false;
			}
			den++;
		}
		return den == n;
	}
}