class compare{
    public static void main(String[] args) {
        // Objects points to same reference
        String a="vinod";
        String b="vinod";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        // Create two different new objects
        String obj1= new String("vinod");
        String obj2=new String("vinod");
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}