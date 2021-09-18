import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("ok string");
        System.out.println(Arrays.toString(new int[]{2,3,4,5})); //Calling dot value thAN DOT TOSTRING // Null pointer exception
        // over writing(overriding) toString method to Arrays.toString(obj)
        Integer num=new Integer(56);
        System.out.println(num.toString());
        String name=null;
        System.out.println(name);
        int div=8/2;
        System.out.println(div);
    }
}
