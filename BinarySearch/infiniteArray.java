public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,88};
        System.out.println(ans(arr, 7,0,1));
    }
    
    static int ans(int[] arr, int target,int start,int end){
        try {
            while (target > arr[end]) {
                int temp=end+1;
                end= end+(end-start+1)*2;
                start=temp;
            }
        } catch (Exception e) {
            ans(arr, target, start, end-1);
        }
        System.out.println("start="+start+", end="+end);
        return BinarySearch2(arr,target,start,end);
    }

    static int BinarySearch2(int[] arr,int target, int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
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
}
