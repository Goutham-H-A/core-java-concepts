package p3;

public class Exception {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y);//Divide by zero not possible
        } catch (ArithmeticException e) {//Unchecked or RunTime Exception
            e.printStackTrace();
        }
        System.out.println("This will print if Exception is handled");
    }
}