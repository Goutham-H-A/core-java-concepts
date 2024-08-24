package interfaces;

public interface A {//interfaces in java has abstract methods
    void run();
    default void run2(){
        System.out.println("Running method");
    }

}
