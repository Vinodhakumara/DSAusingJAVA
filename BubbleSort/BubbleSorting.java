import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={2,3,1,3,2,4,6,7,9,2,19};//{9,8,4,1,2,3,10};
        int[] arr2={2,1,4,3,9,6};
        System.out.println(arr.length);
        // Combine two arrays
        int[] temp=new int[arr.length+arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            temp[i]=arr[i];
        }
        for (int i = 0; i < arr2.length-1; i++) {
            temp[arr.length+i]=arr2[i];
            
        }
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean flag=true;
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
}
