interface Beverage {
    // The component
    public String description();
}

abstract class Decorator implements Beverage {
    protected Beverage wrappedObj;
}

class Coffee implements Beverage {
    // Concrete component
    public String description(){return "Coffee";}
}

class AddMilk extends Decorator {
    // Concrete decorator
    public AddMilk(Beverage c){
        wrappedObj = c;
    }
    public String description(){
        return wrappedObj.description() + " + Milk";
    }
}

public class DemoDecorator {
    public static void main(String[] args){
        Beverage coffee = new Coffee();
        System.out.println( coffee.description() );

        Beverage coffeeMilk = new AddMilk(coffee);
        System.out.println( coffeeMilk.description() );
    }
}
