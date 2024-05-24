package StrategyPattern.tow.duckBehavior.impl;

import StrategyPattern.tow.duckBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("翅膀飞行。。。 \n");
    }
}
