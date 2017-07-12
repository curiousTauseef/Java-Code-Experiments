package data.structures.examples;

/**
 * @author ilariacorda on 12/07/2017.
 * @project Java-Code-Experiments
 */
public class RotateArray {

    public static void main(String args[]) {
        int[] myArray = new int[5];
        myArray[0] = 3;
        myArray[1] = 8;
        myArray[2] = 9;
        myArray[3] = 7;
        myArray[4] = 6;

        int[] resultArray = rotateArray(myArray, 3);
        for (int i = 0; i < myArray.length; i++) {

            System.out.println("current element of the initial array is : " + myArray[i]);
        }

        for (int y = 0; y < resultArray.length; y++) {

            System.out.println("current element of resulting array is: " + resultArray[y]);
        }

    }

    public static int[] rotateArray(int[] A, int K) {
        //create the array of the same length as the initial one
        int[] B = new int[A.length];
        //Loop through the first array A
        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }
        return B;
    }
}
