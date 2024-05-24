package StrategyPattern.exercise.behavior.impl;

import StrategyPattern.exercise.behavior.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("使用斧子劈砍。。。");
    }
}
