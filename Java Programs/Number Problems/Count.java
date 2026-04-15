import java.util.Scanner;
class Count
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int result = isCount(n);
		System.out.println("Count: " + result);
		
	}
	
	public static int isCount(int n){
		int count = 0;
		for(int i = 0; i < n; n /= 10){
			count++;
		}
		return count;
	}
}