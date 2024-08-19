package abstration;

public class B implements A{
    @Override
    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
