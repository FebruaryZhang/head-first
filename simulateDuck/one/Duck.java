package simulateDuck.one;

import simulateDuck.one.duckBehavior.FlyBehavior;
import simulateDuck.one.duckBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all ducks float, even decoys!");
    }
}
