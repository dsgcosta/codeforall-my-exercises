package io.codeforall.bootcamp;

//GuessNumber

public class Game {
    public int gameNumber;

    public int getGameNumber() {
        gameNumber = Generator.getRandomNumber();
        return gameNumber;
    }


   /*
   public void compareNums(){

   }
   */






    public int getComparison() {
       Player player2 = new Player();
       int test1 = player2.getPlayerNumber();
       Game game2 = new Game();
       int test2 = game2.getGameNumber();
       return test2;

       //System.out.println("player2.getPlayerNumber(): "+  player2.getPlayerNumber());

        /*
        if (gameNumber == Gustavo2.playerNumber) {
            System.out.print("Players wins!");
        } else {
            System.out.println("Wrong number");

        }
        */
    }

}



