// Rotate the number by 1 position
import java.util.Scanner;
class Rotate1Position
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n = sc.nextInt();
		
		int last = n % 10;
		int remaining = n / 10;
		
		int mul = 1;
		
		int temp = remaining;
		while(temp > 0){
			mul *= 10;
			temp /= 10;
		}
		
		int rotated = last * mul + remaining;
		System.out.println("Rotated: " + rotated);
		
		
	}
}