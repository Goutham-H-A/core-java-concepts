package optionalclasses;

import java.util.Optional;
//Optional classes in java is used for determing NULLPOINTER EXCEPTION
public class A {
    public static void main(String[] args) {
        A a = null;

        Optional<A> val = Optional.ofNullable(a);
        if (val.isPresent()){
            System.out.println(a);
        }else {
            System.out.println("NULL POINTER EXCEPTION");
        }
    }
}
