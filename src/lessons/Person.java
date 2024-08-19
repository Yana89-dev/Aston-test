package lessons;

public class Person {

    private int age;
    private String name = "Sergei";
    private static int counter = 0;

    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Non static block");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static int getCounter() {
        return counter;
    }


    public Person(int age) {
        this.age = age;
        counter++;
    }

    public Person(String name) {
       // this(22);
        this.name = name;
        counter++;

    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;
        System.out.println("Constructor");
    }

    public void sayHello(){
        System.out.println("Hey, my name is " + name);
    }

    public void sayHello(int age){
        System.out.println("Hey, my age is " + age);
    }

    public String sayHello(String str){
        return "Hey, my name is " + str;
    }


    static void meetTwoPerson(){
        System.out.println("Hello! Hi-Hi!");
    }

    static Person createOld(){
        return new Person(22, "Ivanich");
    }
}
