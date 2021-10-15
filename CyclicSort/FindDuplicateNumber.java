import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class FindDuplicateNumber {
    public static void main(String[] args){
        int[] arr={9,8,7,6,6,4,0,3,2,1};
        int i=0;
        while (i < arr.length) {
            if(arr[i] < arr.length && arr[i] != i && arr[i] == arr[arr[i]]){
                swap(arr, arr[i], i);
            }
            else{
                i++;
            }
        }
        ArrayList <Integer> res=new ArrayList<>();
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j] != j){
                res.add(arr[j]);
                // System.out.println(j+" "+arr[j]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }

    public static void swap(int[] arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
