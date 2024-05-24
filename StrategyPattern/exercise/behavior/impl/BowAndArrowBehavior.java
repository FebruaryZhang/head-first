package StrategyPattern.exercise.behavior.impl;

import StrategyPattern.exercise.behavior.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("用弓箭射杀。。。");
    }
}
