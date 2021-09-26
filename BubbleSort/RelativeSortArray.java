import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr={2,3,1,3,2,4,6,7,9,2,19};//{9,8,4,1,2,3,10};
        int[] arr2={2,1,4,3,9,6};
        ArrayList <Integer> temp=new ArrayList<Integer>();
        bubbleSort(arr);
        compare(temp,arr,arr2);
        temp.get(arr.length-2);
        System.out.println(arr);
    }

    public static void compare(ArrayList<Integer> temp,int[] arr,int[] arr2) {
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr2[i] == arr[j]){
                    System.out.println(temp);
                    temp.add(arr[i]);
                    k++;
                }
            }
        }
        for (int i=k; i < arr.length; i++) {
            temp.add(arr[i]);
        }
        System.out.println(temp);
    }
    public static int[] bubbleSort(int[] arr) {
        boolean flag=true;
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr[j], arr[j+1]);
                    flag=false;
                    }
            }
            if(flag){
                return arr;
            }
        }
        if(!flag){
            System.out.println("After Sorting");
            return arr;
        }
        return arr;
    }
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
    }
}
