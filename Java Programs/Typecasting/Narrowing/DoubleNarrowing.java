class DoubleNarrowing 
{
    public static void main(String[] args) 
    {
        double d = 98.78;
        System.out.println(d);
        
        float f = (float)d;
        System.out.println(f);
        
        long l = (long)d;
        System.out.println(l);
        
        int i = (int)d;
        System.out.println(i);
		
		char ch = (char)d;
		System.out.println(ch);
        
        short s = (short)d;
        System.out.println(s);
        
        byte b = (byte)d;
        System.out.println(b);
    }
}
