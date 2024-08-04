package p2;

import p1.AccessSpecifier;

public class AccessSpecifier2 extends AccessSpecifier {
    public static void main(String[] args) {
    AccessSpecifier2 a2 = new AccessSpecifier2();
        System.out.println(a2.z);//access diff package with inheritance
        System.out.println(a2.a);//access anywhere with or without inheritance
    }
}
