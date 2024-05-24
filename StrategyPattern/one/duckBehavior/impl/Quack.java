package StrategyPattern.one.duckBehavior.impl;

import StrategyPattern.one.duckBehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱叫。。。\n");
    };
}
