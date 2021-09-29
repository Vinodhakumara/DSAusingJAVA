import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={10,9,7,6,0,0,3,2,1};
        int i=0;
        while (i < arr.length) {
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, arr[i], i);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j] != j){
                System.out.println(j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
