package simulateDuck.tow;

import simulateDuck.tow.duckBehavior.impl.FlyWithWings;
import simulateDuck.tow.duckBehavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    public void display() {
        System.out.println("绿头鸭。。。 \n");
    }
}
