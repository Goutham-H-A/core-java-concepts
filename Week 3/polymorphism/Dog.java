package polymorphism;

public class Dog extends Cat {
    @Override // Annotation in Java checks whether methods are overring or not
    //this noise method has public access specifier which is higher scope than default so NO ERROR
    public void noise(){//overing method 'noise' which as same method of base class
        System.out.println("Bow Bow");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.noise();
        d.eat();
    }
}
