public class SmallestLetter {
    public static void main(String[] args) {
        char[] ch= {'c','d','f','h','z'};
        System.out.println(smallestChar(ch, 'h'));
    }

    static char smallestChar(char[] letters, int target){
        int start=0;
        int end= letters.length-1;
        while (start<= end) {
            int mid= start+(end-start)/2;
            if(letters[mid] > target){
                end= mid-1;
            }else{
                start= mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
