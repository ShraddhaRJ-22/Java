// Check Prime number or not
import java.util.Scanner;
class CheckPrime
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		int num = sc.nextInt();
		
		if (num <= 1){
			System.out.println(num + " is not a Prime Number");
		}
		
		int den = 2;
		while(den <= num/2){
			if(num % den == 0) {
				break;
			}
			den ++;
		}
		if(den > num/2){
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
		
	}
}