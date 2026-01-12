class LongNarrowing
{
	public static void main(String[] args)
	{
		long l = 98765l;
		System.out.println(l);
		
		int i = (int)l;
		System.out.println(i);
		
		char ch = (char)l;
		System.out.println(ch);
		
		short s = (short)l;
		System.out.println(s);
		
		byte b = (byte)l;
		System.out.println(b);
	}
}