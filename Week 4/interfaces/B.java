package interfaces;

public class B implements A {//interfaces can be inherited into classes by using implements keyword
    @Override//Overiding the abstract method declared in interface A
    public void run(){
        System.out.println("Run");
    }

    public static void main(String[] args) {
        B b = new B();
        b.run2();
        b.run();
    }
}
