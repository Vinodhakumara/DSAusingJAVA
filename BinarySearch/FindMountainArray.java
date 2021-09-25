public class FindMountainArray {
        public static void main(String[] args) {
            int[] arr2={0,1,2,5,6,4,3};
            System.out.println(search(arr2,6));
        }
    
        static int search(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            while (start < end) {
                int mid=start+(end-start)/2;
                if(arr[mid] < arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
                return arr[start]== target ? start: bs1(arr, 0,start,target);
        }
    
        static int bs1(int[] arr,int start, int end, int target){
            System.out.println(start+""+end);
                while(start <= end){
                    int mid=start+(end-start)/2;
                    if(arr[mid] == target){
                        return mid;
                    }
                    if(target < arr[mid]){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
                return bs2(arr,start+1,arr.length+1,target);
        }
    
        public static int bs2(int[] arr,int start,int end,int target) {
            while(start <= end){
                int mid=start+(end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if(target < arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return -1;
        }
}
