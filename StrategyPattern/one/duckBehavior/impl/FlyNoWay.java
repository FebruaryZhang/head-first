package StrategyPattern.one.duckBehavior.impl;

import StrategyPattern.one.duckBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("不会飞。。。 \n");
    }
}
