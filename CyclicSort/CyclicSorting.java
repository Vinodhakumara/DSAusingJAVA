import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr={8,9,7,6,5,4,3,2,1};
        int i=0;
        while (i < arr.length) {
            if(arr[i]-1 != i){
                swap(arr, arr[i]-1, i);
            }else{
                i++;
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
