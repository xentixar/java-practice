interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Pigeon implements Animal, Bird {
    public void eat() {
        System.out.println("Can eat!!");
    }

    public void fly() {
        System.out.println("Can fly!!");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Animal a = new Pigeon();
        a.eat();
        
        Bird b = (Bird) a;
        b.fly();
    }
}
