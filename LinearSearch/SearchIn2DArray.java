import java.lang.annotation.Target;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {5,6,8},
            {4,12,543}
        };
        System.out.println(searchIn2D(arr, 622));
    }

    static boolean searchIn2D(int[][] arr,int target){
        for (int index = 0; index < arr.length; index++) {
            for (int j = 0; j < arr[index].length; j++) {
                if (arr[index][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
