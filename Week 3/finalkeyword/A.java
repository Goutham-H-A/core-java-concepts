package finalkeyword;

public final class A { //Final class cannot be inherited
    final int y=1;//Final Non-static variable must be initialize
    final static int x=0;//Final static variable must be initialize

    final public void run(){//Final method cannot be Override
        System.out.println("Run");
    }
}
