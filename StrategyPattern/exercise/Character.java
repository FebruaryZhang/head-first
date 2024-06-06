package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.WeaponBehavior;

public abstract class Character {

    public Character() {};

    public WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    };

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}
