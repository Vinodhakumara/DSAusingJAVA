import java.util.Arrays;

public class selectionSorting {
    public static void main(String arg[]){
        int[] arr= {0,2,3,4,1,8,5,6,7};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max=arr.length-i-1,findMax;
                findMax=findmaximum(arr,0,max);
            swap(arr, findMax, max);
        }
    }

    public static int findmaximum(int[] arr,int start,int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max] ){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
    