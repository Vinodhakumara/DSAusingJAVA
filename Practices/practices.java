import java.util.HashMap;

public class practices {
    public static void main(String arg[]){
        int arr[]={1,2,3,1,3,4,5};
        removedup(arr);
        System.out.println(reverseString("hello hero"));
        System.out.println(reserseStringStringBuilder("this is string builder"));
        System.out.println(reservseOrderOfWords("This is a reseverse order of words"));
    }

    public static String reservseOrderOfWords(String str) {
        StringBuilder output= new StringBuilder();
        String[] words=str.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            output.append(words[i]);
            output.append(" ");
        }
        return output.toString().trim();
    }
    public static String reserseStringStringBuilder(String str) {
        StringBuilder output=new StringBuilder(str).reverse();
        return output.toString();
    }
    public static String reverseString(String str) {
        if(str == null){
            return null;
        }
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
            }
        return str2;
    }
    public static void removedup(int[] arr) {
        HashMap <Integer,Boolean> mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(mp.get(arr[i]) == null){
                System.out.println(arr[i]);
            }
                mp.put(arr[i],true);
        }
    }
}

