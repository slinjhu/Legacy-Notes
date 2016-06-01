interface Animal {
    String makeSound();
}

class Dog implements Animal {
    public String makeSound(){return "bark";}
}

class Cat implements Animal {
    public String makeSound(){return "meow";}
}

public class DemoInterface {
    private static void printSound(Animal animal){
        // We don't need to know if it is a dog or cat or whatever.
        System.out.println( animal.makeSound() );
    }
    public static void main(String[] args){
        // We can assign the concrete implementation object at runtime.
        printSound(new Dog());
        printSound(new Cat());
    }
}
