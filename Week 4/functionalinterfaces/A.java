package functionalinterfaces;

@FunctionalInterface
public interface A {//Functional interface should have atleast one abstract method and can have any number of Complete methods
    public void test1();
    default public void test2(){//default keyword is used to create complete methods
        System.out.println("Test 2");
    }
}
