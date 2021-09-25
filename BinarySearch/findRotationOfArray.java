public class findRotationOfArray {
    public static void main(String[] args) {
        // int[] arr={9,8,7,6,5,4,3,2,1,0};
        int[] arr={6,7,9,10,10,11,11,0,1,1,2};
        int target=3;
        System.out.println(rotatecount(arr));
        // System.out.println(findTarget(arr, target));
        // System.out.println(findPivot(arr));
    }
    public static int rotatecount(int[] arr) {
        return findPivot(arr)+1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid < start && arr[mid] > arr[mid+1]){
                return mid-1;
            }
            if(arr[mid] >= arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    // For non duplicate
    // For a duplicates
    static int findPivotdup(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] > arr[mid+1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] > arr[end-1]){
                    return end;
                }
                end--;
            }
            
            if(arr[mid] >= arr[start] && arr[mid] >= arr[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
