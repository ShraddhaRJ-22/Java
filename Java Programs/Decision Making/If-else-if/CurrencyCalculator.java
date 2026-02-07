// Currency Calculator
import java.util.Scanner;
class CurrencyCalculator
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("********* WELCOME TO CURRENCY CALCULATOR *********");
		System.out.println("\n Enter your Amount (INR): \n");
		double amt = sc.nextDouble();
		
		System.out.println("1. USD \n2. EUR \n3. KWD \n4. GBP \n5. JPY \n6. CND \n7. BRL \n8. CHF \n9. AUD \n10. CNY");
		System.out.println("Enter your Response: ");
		String resp = sc.next().toUpperCase();
		
		boolean assump = true;
		double convertedAmount = 0;
		if(resp.equals("USD")){
			convertedAmount = amt/90.21;
		} 
		else if(resp.equals("EUR")){
			convertedAmount = amt/106.53;
		}
		else if(resp.equals("KWD")){
			convertedAmount = amt/293.61;
		} 
		else if(resp.equals("GBP")){
			convertedAmount = amt/123.29;
		} 
		else if(resp.equals("JPY")){
			convertedAmount = amt/0.58;
		} 
		else if(resp.equals("CND")){
			convertedAmount = amt/65.91;
		} 
		else if(resp.equals("BRL")){
			convertedAmount = amt/17.11;
		} 
		else if(resp.equals("CHF")){
			convertedAmount = amt/115.87;
		} 
		else if(resp.equals("AUD")){
			convertedAmount = amt/63.91;
		} 
		else if(resp.equals("CNY")){
			convertedAmount = amt/12.43;
		} 
		else {
			assump = false;
			System.out.println("\n Invalid Currency \n");
		}
			
		if(assump){
			System.out.println("%n  %20.3f INR = %.3f %s %n",amt, convertedAmount, resp);
		}
	}
}