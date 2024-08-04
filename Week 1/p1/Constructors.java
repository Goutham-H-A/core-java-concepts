package p1;

public class Constructors {
    Constructors(){
        System.out.println("Inside contructor");
    }
    Constructors(int x){//construcot overloading
        System.out.println(x);
    }

    public static void main(String[] args) {
        Constructors ct = new Constructors(); //Constructors method is called as soon as obj created

        Constructors ct2 = new Constructors(100); //Constructors method is called as soon as obj created
    }
}
