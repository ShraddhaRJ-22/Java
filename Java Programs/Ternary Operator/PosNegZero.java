// Positive , Negative & Zero (0)
import java.util.Scanner;
class PosNegZero {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		
		int i = sc.nextInt();
		
		String op = (i == 0) ? ("Entered Number is 0") : 
			(i < 0) ? (i + " is Negative") : (i + " is Positive") ;
		System.out.println(op);
	}
}