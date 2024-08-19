package lessons;

import java.util.Objects;

public class Animal {
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }


    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Animal() {
        System.out.println("Animal constructor");
    }

    public void makeSound(){
        System.out.println("Sound");
    }

    public void performEat(){
        System.out.println("Eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && height == animal.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }
}
