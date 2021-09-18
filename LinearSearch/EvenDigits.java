public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={0,22,12,123,5432,567,89,87,62,31};
        System.out.println(findNumbers(arr));
    }

    // Optimization
    static boolean isEvendigits2(int digit){
        if(digit<0){
            digit*=-1;
        }
        return ((int)(Math.log10(digit))+1)%2 == 0;
    }
    static int findNumbers(int[] arr){
        int count=0;
        for (int i : arr) {
            if(isEvendigits2(i))
            {
                count++;
            }
        }
        return count;
    }
    static boolean isEvendigits(int digit){
        int count=0;
        while(digit>0){
            count++;
            digit=digit/10;
        }
            return count%2 == 0;
    }
}
