// Odd & Even 
import java.util.Scanner;
class OddEven {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		
		int i = sc.nextInt();
		
		String op = (i % 2 == 0) ? (i + " is an Even number") : (i + " is Odd number");
		System.out.println(op);
	}
}