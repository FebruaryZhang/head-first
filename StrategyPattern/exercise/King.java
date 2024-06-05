package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.impl.KnifeBehavior;

public class King extends Character{
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
}
