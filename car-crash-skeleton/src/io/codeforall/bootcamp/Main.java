package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.cars.Mustang;
import io.codeforall.bootcamp.field.Position;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Position pos = new Position();
        //Mustang mustang = new Mustang(pos, false);

        Mustang mustang = new Mustang(pos, false);
        Game g = new Game(100, 25, 200);

        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation

    }
}
