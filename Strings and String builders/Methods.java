import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="vinod";
        System.out.println(Arrays.toString(name.toCharArray())); // String to charactered arrays

        System.out.println(name.toUpperCase());
        System.out.println(name);

        System.out.println(name.indexOf("n")+1);
        // System.out.println(" vinod     ".strip());
        System.out.println(Arrays.toString("vinod kumar".split(" ")));
    }
}
