enum PizzaType {Veggie, Cheese}

interface Pizza {
    void show();
}

class Veggie implements Pizza {
    public void show(){
        System.out.println("Veggie pizza");
    }
}

class Cheese implements Pizza {
    public void show(){
        System.out.println("Cheese pizza");
    }
}

class SimplePizzaFactory {
    public static Pizza makeShape(PizzaType t) {
        switch (t){
            case Cheese: return new Cheese();
            case Veggie: return new Veggie();
            default: return null;
        }
    }
}

public class DemoSimpleFactory {
    public static void main(String[] args){
        // No need to know the specific pizza types.
        Pizza s1 = SimplePizzaFactory.makeShape( PizzaType.Cheese);
        s1.show();
        Pizza s2 = SimplePizzaFactory.makeShape( PizzaType.Veggie);
        s2.show();
    }
}
