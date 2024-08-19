package abstration;
//Multi level inheritance only supports in Interfaces
//Level 3
public class Z implements Y{
    public void test1(){
        System.out.println(1);
    }
    public void test2(){
        System.out.println(2);
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.test1();
        z.test2();
    }
}
