interface AnimalBehavior {
    void makeSound();
}

class Animal {
    public Animal() {
        System.out.println("Animal Called!");
    }

    public void walk() {
        System.out.println("It can walk");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog Called!");
    }

    public void bark() {
        System.out.println("It can bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.bark();
    }
}
