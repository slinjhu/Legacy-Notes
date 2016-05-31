abstract class Beverage {
    // The component
    public String description(){return "";}
}

abstract class Decorator extends Beverage {
    protected Beverage beverage;
}

class Coffee extends Beverage {
    // Concrete component
    public String description(){return "Coffee";}
}

class AddMilk extends Decorator {
    // Concrete decorator
    public AddMilk(Beverage c){
        beverage = c;
    }
    public String description(){
        return beverage.description() + " + Milk";
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
