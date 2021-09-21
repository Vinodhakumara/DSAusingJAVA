public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr= { 1,23,45,56,76};
        System.out.println(floor(arr, 45));
    }

    static int floor(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if(arr[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end % arr.length];
    }
}
