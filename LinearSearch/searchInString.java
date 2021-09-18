import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String str= "VInod";
        char target= 'o';
        System.out.println(search2(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search2(String str,char target){
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index)==target) {
                return true;
            }
        }
        return false;
    }
}
