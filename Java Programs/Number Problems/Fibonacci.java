import java.util.Scanner;
class Fibonacci
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		fibonacci(n);
	}
	
	public static void fibonacci(int n){	
		
		int n1 = 0, n2 = 1;
		for (int i = 0; i < n ; i++ )
		{
			int ans = n1 + n2;
			System.out.println(n1);
			
			n1 = n2;
			n2 = ans;
		}
		System.out.println(n1);
	}
}