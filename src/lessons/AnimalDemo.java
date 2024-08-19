package lessons;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Animal(), new Cat(), new Dog(), new Cat()};
        for (Animal animal : zoo) {
            animal.makeSound(); // Это переопределение (динамическое)
        }

        Cat cat1 = new Cat(44,58);
        cat1.makeSound(34);
        cat1.performEat();
        System.out.println(cat1.toString());

        Cat cat2 = new Cat(44,58);
        System.out.println(cat1.equals(cat2));

      //  Cat cloneCat  = cat1.clone();

        Animal animal = new Animal();
        System.out.println(animal.toString());

        final int num = 22;
       // num = 44; не получится поменять


    }
}
