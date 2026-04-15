// String Reverse
class StringReverse
{
	public static vois main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String str = num + ""; // this converts the num into String
		String rev = "";
		
		for(int i = 0;i < str.length(); i++){
			char ch = str.chartAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
	}
}