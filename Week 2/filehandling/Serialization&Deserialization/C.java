package filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//Deserialization: getting Back the Object from given file path
public class C {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F://obj.ser");

            ObjectInputStream ois = new ObjectInputStream(fis);
            A a2 = (A) ois.readObject();
            System.out.println(a2.name);
            System.out.println(a2.password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
