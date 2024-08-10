package filehandling;

import java.io.File;

public class FileReading {
    File f=new File("F:\\file.txt");
    //creating file
    public void createFileFunction(){

        try{
            boolean res=f.createNewFile();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //checking file exist
    public void fileExistFunction(){
        boolean res = f.exists();
        System.out.println(res);
    }

    //checking the number of characters present in file
    public void fileContentLength(){

        long val = f.length();
        System.out.println(val);
    }

    //delete file
    public void deleteFileFunction(){
        boolean deleteornot = f.delete();
        System.out.println(deleteornot);
    }
    public void createFolder(){
        boolean foldercreated=f.mkdir();
        System.out.println("Folder Created"+foldercreated);
    }

    public static void main(String[] args) {
    FileReading fr=new FileReading();
   fr.createFileFunction();//path example F:\file.txt
    fr.fileExistFunction();
   fr.fileContentLength();
  fr.deleteFileFunction();
  fr.createFolder(); //path path example F:\folder\file.txt
 }
}
