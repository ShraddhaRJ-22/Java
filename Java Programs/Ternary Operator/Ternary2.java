class Ternary2
{
	public static void main(String [] args)
	{
		int n1 = 80;
		int n2 = 5;
		int n3 = 45;
		
		int smallest = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
		System.out.println(smallest);
	}
}
