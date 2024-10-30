package io.codeforall.bootcamp.cars;
import io.codeforall.bootcamp.field.Position;
public class Mustang extends Car {
    private Position pos;
    private boolean isCrashed;

    public Mustang(Position pos, boolean isCrashed){
        this.pos = pos;
        this.isCrashed = false;
    }
}
