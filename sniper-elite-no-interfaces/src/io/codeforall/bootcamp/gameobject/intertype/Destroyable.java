package io.codeforall.bootcamp.gameobject.intertype;

public interface Destroyable {
    public abstract void hit(int damage);

    public abstract boolean isDestroyed();
}
