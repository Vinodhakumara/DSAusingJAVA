public class SearchInRange {
    public static void main(String[] args) {
        String str="I am Developer";
        char target='e';
        System.out.println(searchinrange(str, 2, 20, target));
    }

    static boolean searchinrange(String str, int start, int end,char target){
        if (str.length() <= 0 ){
            return false;
        }
        System.out.println(str.length());
        for (int index = start; index < end; index++) {
            if (str.length() <= index) {
                return false;
            }
            if(str.charAt(index) == target){
                return true;
            }
        }
        return false;
    }
}
