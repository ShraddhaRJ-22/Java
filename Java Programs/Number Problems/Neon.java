// Neon
import java.util.Scanner;
class Neon
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if (isNeon(num))
		{
			System.out.println(num + " is a Neon number");
		} else {
			System.out.println(num + " is not a Neon number");
		}
		
	}
	public static boolean isNeon(int num){
		int sq = num * num;
		int sum = 0;
		while(sq != 0){
			sum = sum + (sq % 10);
			sq /= 10;
		}
		return num == sum;
	}
}