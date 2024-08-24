package encapsulation;

public class Person {
    private String name;
    private int age;
    private char gender;

    //Getters and Setters are used to access the values
    //These Getters and Setters are 'public' methods which can be accesed anywhere
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
}
