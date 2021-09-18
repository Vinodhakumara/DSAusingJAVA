import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+1));

        System.out.println("a"+1); // 1 is converted to tostring()

        System.out.println("vinod "+new ArrayList<>()); // Arralist converted to tostring()

        String ans= new Integer(56)+""+new Integer(34);  // concatination not works on objects so using string
        System.err.println(ans);

        // "+" overloading toString

    }
}
