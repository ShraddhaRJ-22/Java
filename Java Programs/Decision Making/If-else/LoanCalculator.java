// Loan Calculator
import java.util.Scanner;
class LoanCalculato
{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		for(; ; ){
			System.out.println("\n       ******** WELCOME ******** \n");
			System.out.println("Amount: ");
			double amount = sc.nextDouble();
			if(amount < 1000 || amount > 100000){
				System.out.println("\n Invalid Amount \n");
				continue;
			}
			System.out.println("Rate of Interest (P.M): ");
			double interest = sc.nextDouble();
			if(interest < 1 || interest > 30){
				System.out.println("\n Invalid Interest \n");
				continue;
			}
			System.out.println("Loan Tenure (months): ");
			int tenure = sc.nextInt();
			if(tenure < 3 || tenure > 36) {
				System.out.println("\n Invalid Tenure \n ");
				continue;
			}
			
			double perMonthInt = (amount/100)*interest;
			double totalInterestAmount = perMonthInt * tenure;
			double emi = (amount + totalInterestAmount) * tenure;
			double totalAmount = amount + totalInterestAmount;
			
			System.out.println("emi"+emi);
			System.out.println("amount"+amount);
			System.out.println("totalInterestAmount"+totalInterestAmount);
			System.out.println("totalAmount"+totalAmount);
		}
	}
}