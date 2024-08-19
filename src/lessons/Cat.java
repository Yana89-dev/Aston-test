package lessons;

public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat constructor");
    }

    public Cat(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Mew mew mew " + getWeight());
    }

    public void makeSound(int num) { // Это перегрузка
        System.out.println("Mew mew mew " + num);
    }

    @Override
    public void performEat() {
        System.out.println("Eat mouse");
    }
}
