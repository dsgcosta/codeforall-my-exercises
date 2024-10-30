package io.codeforall.bootcamp;

public class Player {
    public int playerNumber;

    public int getPlayerNumber() {
        playerNumber = Generator.getRandomNumber();
        return playerNumber;
    }
}
