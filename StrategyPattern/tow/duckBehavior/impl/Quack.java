package StrategyPattern.tow.duckBehavior.impl;

import StrategyPattern.tow.duckBehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱叫。。。\n");
    };
}
