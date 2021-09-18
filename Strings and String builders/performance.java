
public class performance {
    public static void main(String[] args) {
        String series= "";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            series+=ch; // Every time calling string, every time creating new storage so it's wastage of storage/garbage values
        }
        System.out.println(series);
    }
}
