class Array1 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(arr[3]); // prints hexadecimal values

        /*
         * 
         * In java, Array is an Object
         * Array is a collection of similar data/homogenous data
         * Through array we can hold multiple values in a single variable
         * We cannot change the size of array at runtime (Immutable)
         * It uses contigous memory location for fast access
         * Array supports INDEX (from Zero)
         * Java never returns the address of the element for security purpose
         * 
         * 
         * 
         * Types of Array
         * 1. Single Dimensional Array(1D)
         * 2. Multi Dimensional Array(2D, 3D)
         * - Regular Array
         * - Jagged Array
         * 
         * 
         */

        // Array iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}