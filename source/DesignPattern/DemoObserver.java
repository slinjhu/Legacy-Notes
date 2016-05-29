import java.util.Observable;
import java.util.Observer;

class MyData extends Observable{
    // Data in the model-view paradigm

    private int data;

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
        super.setChanged();
        super.notifyObservers();
    }
}

class Display implements Observer{
    @Override
    public void update(Observable o, Object arg){
        MyData myData = (MyData) o;
        System.out.println("Updated: " + myData.getData());
    }
}

public class DemoObserver{
    public static void main(String[] args){
        MyData myData = new MyData();
        myData.addObserver(new Display());
        myData.setData(5);
    }
}
