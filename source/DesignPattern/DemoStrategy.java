interface Strategy {
    // All algorithms are interchangeable because they implement the same interface
    int run(int x1, int x2);
}

class Add implements Strategy {
    // Each algorithm is encapsulated in a class
    public int run(int x1, int x2){return x1 + x2;}
}

class Multiply implements Strategy {
    public int run(int x1, int x2){return x1 * x2;}
}

class Client {
    private Strategy strategy;
    public Client(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int x1, int x2){
        return strategy.run(x1, x2);
    }
}

public class DemoStrategy {
    public static void main(String[] args){
        Client client = new Client(new Add());
        int result = client.executeStrategy(3, 4);
    }
}
