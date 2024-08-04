package p1;
//static,Non Static ,Local and instance variable
public class TypesOfVariables {
    static int x=10; //static if not initialize take x=0
    int y=20; //non- static if not initialize take y=0

    public static void main(String[] args) {
        int z=100; //Local variable must be initialize
        System.out.println(z);
        System.out.println(x); //can be access class or direct
        TypesOfVariables ty = new TypesOfVariables();
        System.out.println(ty); //instance or reference variable ty
        System.out.println(ty.y); //should be access using object
    }
}
