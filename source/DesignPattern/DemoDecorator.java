interface Beverage { // The component
    String toString();
}

abstract class Decorator implements Beverage {
    protected Beverage wrappedObj;
}

class Coffee implements Beverage {
    // Concrete component
    public String toString(){return "Coffee";}
}

class AddMilk extends Decorator {
    // Concrete decorator
    public AddMilk(Beverage c){
        wrappedObj = c;
    }
    public String toString(){
        return wrappedObj.toString() + " + Milk";
    }
}

public class DemoDecorator {
    public static void main(String[] args){
        Beverage coffee = new Coffee();
        System.out.println( coffee );

        Beverage coffeeMilk = new AddMilk(coffee);
        System.out.println( coffeeMilk );
    }
}
