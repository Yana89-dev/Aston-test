package lessons;

public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog constructor");
    }

    public Dog(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Gaw Gaw Gaw " + getWeight());
    }

    @Override
    public void performEat() {
        System.out.println("Eat bone");
    }
}
