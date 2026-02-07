// Positive & Negative 
import java.util.Scanner;
class PosNeg {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		
		int i = sc.nextInt();
		
		String op = (i < 0) ? (i + " is Negative") : (i + " is Positive");
		System.out.println(op);
	}
}