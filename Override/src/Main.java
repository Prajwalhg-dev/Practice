//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Animal {
    void playSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void playSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void playSound() {
        System.out.println("Cat says: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.playSound();
        dog.playSound();
        cat.playSound();
    }
}