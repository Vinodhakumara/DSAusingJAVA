public class SearchInRotationArray {
    public static void main(String[] args) {
        // int[] arr={9,8,7,6,5,4,3,2,1,0};
        int[] arr={1,7,9,5,4,1,2};
        int target=3;
        System.out.println(findPivot(arr));
        // System.out.println(findTarget(arr, target));
        // System.out.println(findPivot(arr));
    }
    static int findTarget(int[] arr, int target){
        int pivot= findPivot(arr);
        System.out.println(pivot);
        if(pivot == -1){
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        

        if(arr[0] <= target){
            return BinarySearch(arr, target, 0, pivot-1);
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
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
