
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={'c','f','j'};
        // System.out.println(binarysearch(arr, 88));
        System.out.println(2 == arr.length-1 && arr[2] <= 'k');
        if(4 == arr.length-1 && arr[4] <= 'k'){
            System.out.println(arr[0]);
        }
        System.out.println('z'<='a');
    }   
    
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            // int mid= (start+end)/2; this may throw error when exceeds range size of datatype
            int mid=start+(end-start)/2;   
            if (target < arr[mid]) {
                end=mid-1;
            }else if (target > arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}


