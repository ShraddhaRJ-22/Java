class ByteWidening 
{
	public static void main(String[] args) 
	{
		byte a1 = 98;
		System.out.println(a1);
		
		short s1 = a1;
		System.out.println(s1);
		
		int i1 = a1;
		System.out.println(i1);
		
		int i2 = 'a';
		System.out.println(i2);
		
		long l1 = a1;
		System.out.println(l1);
		
		float f1 = a1;
		System.out.println(f1);
		
		double d1 = a1;
		System.out.println(d1);
	}
}
