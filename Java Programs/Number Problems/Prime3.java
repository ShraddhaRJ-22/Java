// Prime using Square root method
import java.util.Scanner;
class Prime3
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		if(isPrime(n)){
			System.out.println(n + " is a Prime number");
		} else {
			System.out.println(n + " is not a Prime number");
		}
	}
	
	public static boolean isPrime(int n){
		if(n <= 1 || n % 2 == 0){
			return false;
		}
		int i = 3;
		for(; i*i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}
		if(i*i > n){
			return true;
		}
		else {
			return false;
		}
	}
}