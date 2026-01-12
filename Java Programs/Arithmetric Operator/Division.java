class Division
{
    public static void main(String[] args) 
    {
        byte a = 10;
        byte b = 5;
        int ansByte = a / b;
        System.out.println("Byte Division: " + ansByte);
        
        short c = 10;
        short d = 5;
        int ansShort = c / d;
        System.out.println("Short Division: " + ansShort);
        
        int e = 10;
        int f = 5;
        int ansInt = e / f;
        System.out.println("Int Division: " + ansInt);
        
        char g = 'b';
        char h = 'a';
        int ansChar = g / h;
        System.out.println("Char Division: " + ansChar);
        
        long i = 1000l;
        long j = 500l;
        long ansLong = i / j;
        System.out.println("Long Division: " + ansLong);
        
        float k = 10.5f;
        float l = 5.2f;
        float ansFloat = k / l;
        System.out.println("Float Division: " + ansFloat);
        
        double m = 10.9870d;
        double n = 5.6543d;
        double ansDouble = m / n;
        System.out.println("Double Division: " + ansDouble);
    }
}
