class LongWidening 
{
	public static void main(String[] args) 
	{
		long l = 87654l;
		
		float f = l;
		System.out.println(f);
		
		double d = l;
		System.out.println(d);
	}
}
