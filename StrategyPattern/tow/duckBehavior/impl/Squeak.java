package StrategyPattern.tow.duckBehavior.impl;

import StrategyPattern.tow.duckBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱叫。。。\n");
    };
}
