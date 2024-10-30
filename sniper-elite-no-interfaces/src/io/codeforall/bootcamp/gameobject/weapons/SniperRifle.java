package io.codeforall.bootcamp.gameobject.weapons;

import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.intertype.Destroyable;

/**
 * A sniper rifle used to kill enemies
 */
public class SniperRifle {

    //public static final double HIT_PROBABILITY = 0.7;
    private int bulletDamage = 1;
    private final float HIT_PROB = 0.3f;

    private int shotsFired;
    //private int bulletDamage;

    /**
     * Constructs a snipper rifle
     * @param bulletDamage the amount of damaged caused by each shot
     */
    public SniperRifle(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    /**
     * Take a shoot at an enemy
     * @param target the enemy to shoot
     */
    /*public void shoot(Enemy target) {

        shotsFired++;

        if(Math.random() < HIT_PROBABILITY) {

            target.hit(bulletDamage);
            System.out.println("It's a hit!");

        } else {
            System.out.println("It's a miss!");
        }

    }*/

    // declare a parameter of type Destroyable
    public void shoot(Destroyable target) {

        if(Math.random() < HIT_PROB) {

            // call the method hit on the destroyable object
            target.hit(bulletDamage);

            System.out.println("It's a hit!");

        } else {

            System.out.println("It's a miss!");

        }
    }

}
