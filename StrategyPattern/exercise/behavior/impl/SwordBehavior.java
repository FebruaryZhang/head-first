package StrategyPattern.exercise.behavior.impl;

import StrategyPattern.exercise.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    public void useWeapon() {
        System.out.println("使用宝剑挥砍。。。");
    }
}
