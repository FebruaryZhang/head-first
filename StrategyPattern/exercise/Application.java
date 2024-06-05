package StrategyPattern.exercise;

import StrategyPattern.exercise.behavior.impl.AxeBehavior;
import StrategyPattern.exercise.behavior.impl.KnifeBehavior;

public class Application {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();

        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();


        Character knight = new Knight();
        knight.fight();
    }
}
