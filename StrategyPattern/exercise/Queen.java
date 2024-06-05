package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.impl.AxeBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }
}
