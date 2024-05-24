package StrategyPattern.tow;

import StrategyPattern.tow.duckBehavior.impl.FlyWithWings;
import StrategyPattern.tow.duckBehavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("绿头鸭。。。 \n");
    }
}
