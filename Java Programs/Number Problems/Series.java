// 1 11 111 1111 11111 111111
class Series
{
	public static void main(String [] args){
		
		int one = 1;
		for(int i = 0; i < 6; i++){
			System.out.print(one + " ");
			
			one = one * 10 + 1;
		}
	}
}