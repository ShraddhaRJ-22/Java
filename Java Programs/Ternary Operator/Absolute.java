// Absolute 
import java.util.Scanner;
class Absolute {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		
		int i = sc.nextInt();
		
		int op = (i < 0) ? (i *= -1) : (i);
		System.out.println(op);
	}
}