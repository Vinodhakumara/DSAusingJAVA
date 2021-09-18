public class LSearch {
    public static void main(String[] args) {
        int[] arr={1,4,21,34,99,5};
        System.out.println(linearSearch(arr,50));
    }

    public static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}
