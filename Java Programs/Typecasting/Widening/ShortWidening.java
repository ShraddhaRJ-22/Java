class ShortWidening
{
	public static void main(String [] args) {
		short s = 987;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
	
		float f = s;
		System.out.println(f);
	
		double d = s;
		System.out.println(d);
	}
}