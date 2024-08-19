package lessons;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person(23, "Ivan");
        person1.sayHello();
        Class<? extends Person> aClass = person1.getClass();

        //System.out.println(person1.sayHello("Susan"));
        Person person2 = new Person(23,"Ivan");
        Person person3=new Person("Vasya");
        Class<? extends Person> aClass2 = person2.getClass();
        System.out.println(aClass.getClassLoader());
        System.out.println(aClass = aClass); //true
        System.out.println(aClass.equals(aClass2)); //true

       // System.out.println(person3.getAge());
        person3.setAge(35);
       // System.out.println(person3.getAge());
        Person.meetTwoPerson();
      //  System.out.println(Person.getCounter());
        Person person4 = Person.createOld();
        //System.out.println(person4.getAge());



    }
}
