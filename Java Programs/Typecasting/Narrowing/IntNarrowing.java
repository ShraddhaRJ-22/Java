class IntNarrowing
{
	public static void main(String [] args){
		int i = 99;
		System.out.println(i);
		
		char ch = (char)i;
		System.out.println(ch);
		
		short s = (short)i;
		System.out.println(s);
		
		byte b = (byte)i;
		System.out.println(b);
	}
}