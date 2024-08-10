package p1;

import java.util.Scanner;

//For-Whilw-DoWhile
public class Loopingstments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3};

        for(int i=0;i<3;i++){
            System.out.println(array1[i]);
        }

        boolean choice=true;
        while (choice){
            System.out.println("choice is true");//it will print is meassage continuosly in loop

        }
        boolean ch=false;
        do{
            System.out.println("Alhough the condition is false it runs atleast one time");
        }while (ch);{
            System.out.println("While loop runs one time");
        }


    }



}
