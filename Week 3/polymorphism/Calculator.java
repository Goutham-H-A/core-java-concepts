package polymorphism;
//This is Over Loading
public class Calculator {
    //two sum methods has different Data Types of Argument or different number of Argument
    public int sum(int x,int y){
        return x+y;
    }
    public float sum(float x,float y){
        return x+y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int res1 = cal.sum(10,20);
        System.out.println(res1);

        float res2 = cal.sum(10.55F,20.35F);
        System.out.println(res2);
    }

}
