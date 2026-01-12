class Addition 
{
    public static void main(String[] args) 
    {
        byte a = 10;
        byte b = 5;
        int ansByte = a + b;
        System.out.println("Byte Addition: " + ansByte);
        
        short c = 10;
        short d = 5;
        int ansShort = c + d;
        System.out.println("Short Addition: " + ansShort);
        
        int e = 10;
        int f = 5;
        int ansInt = e + f;
        System.out.println("Int Addition: " + ansInt);
        
        char g = 'a';
        char h = 'b';
        int ansChar = g + h;
        System.out.println("Char Addition: " + ansChar);
        
        long i = 10;
        long j = 5;
        long ansLong = i + j;
        System.out.println("Long Addition: " + ansLong);
        
        float k = 10;
        float l = 5;
        float ansFloat = k + l;
        System.out.println("Float Addition: " + ansFloat);
        
        double m = 10;
        double n = 5;
        double ansDouble = m + n;
        System.out.println("Double Addition: " + ansDouble);

        // Boolean addition not allowed in Java
        
        String o = "Shraddha";
        String p = "Jeurkar";
        String Conc = o + p;
        System.out.println("Concatenated String: " + Conc);
    }
}
