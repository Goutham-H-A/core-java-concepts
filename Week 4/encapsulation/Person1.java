package encapsulation;

import java.util.Scanner;

public class Person1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter Gender M/F?");
        String input = sc.next();
        char gender = input.charAt(0);

        //created instance of class Person to access the Getters and Setters methods
        Person p = new Person();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);

        System.out.println("Person Details");
        System.out.println("Name:   "+p.getName());
        System.out.println("Age:    "+p.getAge());
        System.out.println("gender: "+p.getGender());
    }
}
