

public class OrderagnosticBS {
    public static void main(String[] args) {
        int[] arr={1,4,6,88,99};
        System.out.println(binarysearch2(arr, 99));
    }
    static int binarysearch2(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAss= arr[start] < arr[end];
        while (start <= end) {
            int mid=start+(end-start)/2;
            if (arr[mid] ==  target) {
                return mid;
            }
            if (isAss) {
                if (target < arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(target < arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;        
    }
}


