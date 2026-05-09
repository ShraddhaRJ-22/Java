public class MeanOfArray {
    public static int mean()  {
        int arr[] = {  1, 2, 3, 4, 5, 6,  7 };
        int sum = 0;
        for  (int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
 
    public static void main(String [] args){
        System.out.println("Mean : " + mean());
    }
}
