package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.GameObject;
import io.codeforall.bootcamp.gameobject.intertype.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    private int point = 5;
    private int currentDamage;
    private boolean destroyed;
    @Override
    public boolean isDestroyed() {
       return destroyed;
    }

    @Override
    public void hit(int points) {
        point = (point - points > 0) ? point - points : 0;
        if (point == 0) {
            destroyed = true;
        }
    }

    @Override
    public String getMessage() {
        return "Barrel down.";
    }
}