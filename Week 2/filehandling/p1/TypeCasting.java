package p1;
//AutoUpcasting,Explicite Down Casting and String to interger conversion
public class TypeCasting {
    //AutoUpcastng
    static int x=10;//lower value
    static float y =x;//higher value

    //Explicite DownCasting
    static float a=100.50F;//Higher Value
    static int b=(int)a;//Lower value

    //Strint to int
    static String id="10";
    static int num=Integer.parseInt(id);

    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(b);
        System.out.println(num);
    }


}
