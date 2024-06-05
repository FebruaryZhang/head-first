package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.impl.SwordBehavior;

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new SwordBehavior();
    }
}
