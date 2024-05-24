package StrategyPattern.one.duckBehavior.impl;

import StrategyPattern.one.duckBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("翅膀飞行。。。 \n");
    }
}
