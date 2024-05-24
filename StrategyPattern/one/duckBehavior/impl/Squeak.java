package StrategyPattern.one.duckBehavior.impl;

import StrategyPattern.one.duckBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱叫。。。\n");
    };
}
