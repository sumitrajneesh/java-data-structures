package in.codinggyan.array;

public class RotateArray {

    /**solution - 1

    /*function to left rotate arr[] of size n by d */
//    void leftRotate(int arr[], int d , int n) {
//        for(int i = 0; i< d; i++) {
//            leftRotatebyOne(arr, n);
//        }
//    }
//
//     void leftRotatebyOne(int[] arr, int n) {
//        int i , temp;
//        temp = arr[0];
//
//         for (i = 0; i < n-1; i++) {
//             arr[i] = arr[i+1];
//         }
//
//         arr[n-1] = temp;
//
//    }
//
//    /*utility function to print an array */
//    void printArray(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        RotateArray rotate = new RotateArray();
//        int arr[] = {1,2,3,4,5,6,7};
//        rotate.leftRotate(arr, 2, 7);
//        rotate.printArray(arr, 7);
//    }
//

    /**solution - 2
     */

    /**function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d , int n) {
        /** To handle if d >= n */

        d = d%n;
        int i , j , k , temp;
        int g_c_d = gcd(d, n);

        for (i = 0; i <g_c_d ; i++) {
            /*move i-th value of block*/
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if(k >= n)
                    k = k - n;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }

            arr[j] = temp;
            
        }
    }

    /*utility function */
    /*function to print an array */

    void printArray(int arr[], int size){
        int i;
        for ( i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    int gcd(int a, int b) {

        if(b == 0)
            return a;
        else
            return  gcd(b, a%b);
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();

        int arr[] = {1, 2,3,4,5,6,7};
        rotateArray.leftRotate(arr, 2, 7);
        rotateArray.printArray(arr, 7);
    }


}
