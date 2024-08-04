package p1;
//Access Specifier
//Access Specifier on class either public or default only
public class AccessSpecifier {
    private String x="private";
    String y ="default";
    protected String z ="protected";
    public String a = "public";

    public static void main(String[] args) {
        AccessSpecifier a1 =new AccessSpecifier();
        System.out.println(a1.x);//access with same class
        System.out.println(a1.y);//access within same package p1
    }

}
