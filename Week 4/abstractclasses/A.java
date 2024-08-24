package abstractclasses;
/*Abstract classes in java can have static,Non-Static variables and methods
But to have Abstract methods 'abstract' keyword is necessary to declare*/
public abstract class A {
    int x =10;
    static int y=20;
    public void test1(){
        System.out.println(1);
    }
    public abstract void test2();//abstract keyword is used here to declare incomplete method
}
