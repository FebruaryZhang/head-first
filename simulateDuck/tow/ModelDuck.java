package simulateDuck.tow;

import simulateDuck.tow.duckBehavior.impl.FlyNoWay;
import simulateDuck.tow.duckBehavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("i'm a model duck");
    }
}
