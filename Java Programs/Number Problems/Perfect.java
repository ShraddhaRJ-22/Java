// Perfect number
import java.util.Scanner;
class Perfect
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		if (isPerf(n))
		{
			System.out.println(n + " is a Perfect number");
		} else {
			System.out.println(n + " is not a Perfect number");
		}
	}
	
	public static boolean isPerf(int n){
		int sum = 0, den = 1;
		while(den < n/2){
			if (n % den == 0)
			{
				sum += den;
			}
			den ++;
		}
		return sum == n	;
	}
}