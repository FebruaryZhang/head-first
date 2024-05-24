package StrategyPattern.tow.duckBehavior.impl;

import StrategyPattern.tow.duckBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("不会飞。。。 \n");
    }
}
