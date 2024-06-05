package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.impl.BowAndArrowBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
