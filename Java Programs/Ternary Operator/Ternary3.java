class Ternary3
{
	public static void main(String [] args)
	{
		int n1 = 7;
		int n2 = 90;
		int n3 = 45;
		
		int largest = n2 > n1 ? (n2 > n3 ? n2 : n3) : (n3 > n1 ? n3 : n1);
		System.out.println(largest);
	}
}