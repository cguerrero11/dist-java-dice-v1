package edu.wctc.dice;

import java.util.Random;

public class Dice10Sided implements Dice{
    @Override
    public int rollDie() {
        Random random = new Random();

        return random.nextInt(10) + 1;
//        return dieRoller.rollDie();
    }
}
