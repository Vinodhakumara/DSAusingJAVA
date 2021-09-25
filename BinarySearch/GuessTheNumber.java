import java.util.Arrays;

public class GuessTheNumber {
    

    public static void main(String[] args) {
        int num=10;
        // int[] arr={2,7,11,15};
        int[] arr={2,7,11,1};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    static int[] twoSum(int[] number, int target) {
        int start=1;
        int end=number.length-1;
        int[] arr={0,1};
        if(number.length < 2 || number == null){
            return arr;
        }
        while(start < end){
            int sum=number[start]+number[end];
            if(sum == target){
                System.out.println(start);
                arr[0]=start++;
                arr[1]=end++;
                return arr;
            }else
            if(sum > target){
                end--;
            }else{
                start++;
            }
            System.out.println(start);

        arr[0]=start;
        arr[1]=end+1;
        }
        return arr;
    }
    static int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start < end){
            int mid=start+(end-start)/2;
            if(guess(mid)==0){
                return mid;
            }else if(guess(mid) == 1){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    
    public static int guess(int n) {
        int pick=6;
        if(pick < n){
            return -1;
        }else if(pick > n){
            return 1;
        }else return 0;
    }
    
}
