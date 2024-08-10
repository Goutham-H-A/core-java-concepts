package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileBufferWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("F://filewrite2.txt");//if append true after comma it wll over ride the existing content in file
//            Writing to file using only FileWriter Class
//            fw.write("This is first line");
//            fw.write("\n");
//            fw.write("The second line");
//            fw.write("\n");
//            fw.write("The Third Line");
//            fw.close();

            //Wrint file using BufferedWriter Class to Optimize process
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("The First Line 3");
            bw.newLine();
            bw.write("The second Line 3");
            bw.newLine();
            bw.write("The Third line 3");
            bw.newLine();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
