class CharNarrowing
{
	public static void main(String [] args){
		char ch = 'd';
		System.out.println(ch);
		
		short s = (short)ch;
		System.out.println(s);
		
		byte b = (byte)ch;
		System.out.println(b);
	}
}