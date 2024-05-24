package StrategyPattern.exercise.behavior.impl;

import StrategyPattern.exercise.behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("使用匕首刺杀。。。");
    }
}
