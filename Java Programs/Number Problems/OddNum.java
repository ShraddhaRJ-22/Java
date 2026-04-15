import java.util.Scanner;
class OddNum
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range of Numbers: ");
		int n = sc.nextInt();
		
		int start = 1;
		while(start < n){
			if(start % 2 != 0){
				System.out.println(start);
			}
			start ++;
		
		}
	}
}