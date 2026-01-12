class FloatNarrowing 
{
	public static void main(String[] args) 
	{
		float f = 98.78f;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		int i = (int)f;
		System.out.println(i);
		
		char ch = (char)f;
		System.out.println(ch);
		
		short s = (short)f;
		System.out.println(s);
		
		byte b = (byte)f;
		System.out.println(b);
	}
}
