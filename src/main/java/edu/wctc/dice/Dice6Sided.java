package edu.wctc.dice;

import java.util.Random;

public class Dice6Sided implements Dice{

    public Dice6Sided(){
        System.out.println("6 Sides");
    }
    @Override
    public int rollDie() {
            Random random = new Random();

            return random.nextInt(6) + 1;
//        return dieRoller.rollDie();
    }
}

