package StrategyPattern.one;

import StrategyPattern.one.duckBehavior.impl.FlyWithWings;
import StrategyPattern.one.duckBehavior.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    public void display() {
        System.out.println("绿头鸭。。。 \n");
    }
}
