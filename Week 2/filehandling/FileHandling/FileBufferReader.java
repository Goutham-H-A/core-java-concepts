package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileBufferReader {
    public static void main(String[] args) {
        try {
            File f = new File("F://file2.txt");
            FileReader fr = new FileReader(f);
            //Uncomment any one and comment one to run code
            //Read only using FileReader Class
            int character;
            while ((character= fr.read())!=-1) {
                System.out.println((char) character);
            }
            //Read using FileReader class with For Each Loop
            System.out.println("Number of Characters in given file  "+f.length());
            char []ch = new char[(int)(f.length())];
            fr.read(ch);
            for(char x:ch){
                System.out.println(x);
            }
            //Read using BufferedReader class to optimize

            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());//first line sentence
            System.out.println(br.readLine());//second line sentence
            System.out.println(br.readLine());//third line sentence

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
