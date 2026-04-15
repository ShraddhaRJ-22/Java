import java.util.Scanner;
class Reverse
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int res = rev(n);
		System.out.println("Reverse : " + res);
	}
	
	public static int rev(int n){
		int rev = 0;
		for (int i = 0; i < n ; n/=10 )
		{
			rev = rev * 10 + (n % 10);
		}
		return rev;
	}
}