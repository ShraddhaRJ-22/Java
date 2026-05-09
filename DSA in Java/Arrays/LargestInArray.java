public class LargestInArray {
    public static int largest() {
        int arr[] = { 12, 45, 78, 2 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Largest : " + largest());
    }
}
