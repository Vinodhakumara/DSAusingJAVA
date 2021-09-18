public class Palindrom {
    public static void main(String[] args) {
        String str= "abcggcba";
        System.out.println(isPalindrome(str));
    }
    
    static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str= str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
                char start= str.charAt(i);
                char end= str.charAt(str.length()-i-1); // 10-0-1=9,10-1-1=8, 10-2-1=7
                if( start!= end){
                    return false;
                }
        }
        return true;
    }
}
