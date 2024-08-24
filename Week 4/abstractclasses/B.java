package abstractclasses;

public class B extends A {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.x);
        System.out.println(A.y);
        b1.test1();
        b1.test2();
    }

    @Override //Overriding the abstract method test2 declared in abstract class A
    public void test2() {
        System.out.println(2);
    }
}
