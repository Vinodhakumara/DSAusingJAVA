public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceilingNumber(arr, 15));
    }

    public static int ceilingNumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){ 
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }     
        }
        return start;
    }
}
