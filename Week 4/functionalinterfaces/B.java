package functionalinterfaces;

public class B {
    public static void main(String[] args) {
        A a = ()->{//Lambdas Expression can only be used in Functional interfaces and Stream API
            System.out.println("test 1 method");
        };
        a.test1();
        a.test2();
    }
}
