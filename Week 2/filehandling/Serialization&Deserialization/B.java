package filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//Serialization: Storing the object in given file path
public class B {
    public static void main(String[] args) {
        try{
            FileOutputStream fos =  new FileOutputStream("F://obj.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            A a1 = new A();
            oos.writeObject(a1);
            oos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
