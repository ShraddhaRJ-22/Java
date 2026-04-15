// Spy Number
import java.util.Scanner;
class Spy
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(isSpy(num)){
			System.out.println(num + " is a Spy number");
		} else {
			System.out.println(num + " is not a Spy number");
		}
	}
	
	public static boolean isSpy(int num){
		int prod = 1, sum = 0;
		for(int i = num; i != 0; i /= 10){
			int last = i % 10;
			prod = prod * last;
			sum = sum + last;
		}
		return prod == sum;	
	}
}