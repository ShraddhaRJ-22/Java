import java.util.Scanner;
class Prime
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		prime(n);
	}
	
	public static void prime(int n){
		int den = 2;
		while (den < n/2)
		{
			if(n % den == 0){
				break;
			}
			den ++;
		}	
		if (den > n/2)
		{
			System.out.println("It is a Prime Number");
		} else {
			System.out.println("It is not a Prime Number");
		}
	}
}
	