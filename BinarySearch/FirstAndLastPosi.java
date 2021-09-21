import java.util.Arrays;

public class FirstAndLastPosi {
    public static void main(String[] args) {
        int[] arr={1,7,7,7,7,8,9};
        System.out.println(Arrays.toString(findPos(arr, 7)));
    }

    static int[] findPos(int[] arr, int target){
        int[] ans={-1,-1};
        int start= searchPos(arr,target,true);
        int end= searchPos(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int searchPos(int[] arr,int target,boolean isStartPos){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end=mid-1;
            }else if(target < arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(isStartPos){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                
            }
        }
        return ans;
    }
}
