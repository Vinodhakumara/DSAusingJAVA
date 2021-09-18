import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // Scanner scan= new Scanner(System.io);
        int[] arr={12,32,43,45,1,88};
        int index1=1;
        int index2=3;
        swapNumber(arr, index1, index2);
        System.out.println(Arrays.toString(arr));

        System.out.println( max(arr) );

        System.out.println( maxInRange(arr,1,4));

        System.out.println( reverse(arr) );
    }

    static int reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end) {
            swapNumber(arr, start++,end-- );
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    static int maxInRange(int[] arr,int start,int end){
        int maxValue= arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue; 
    }

    static int max(int[] arr){
        int maxValue= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue; 
    }

    static void swapNumber(int[] arr, int index1, int index2){
            int temp= arr[index1];
            arr[index1]= arr[index2];
            arr[index2]= temp;
    }
}
