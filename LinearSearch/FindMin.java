public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,-4,5,7,9,100,3};
        System.out.println(mini(arr));
    }

    static int mini(int[] arr){
        int min=arr[0];
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        return min;
    }
}
