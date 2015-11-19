package com.example.androidserversocket;


public class Player {

    int playerNumber;
    int playerHearts;
    boolean playerDead = false;

    public Player(int pNum, int pHearts){
        this.playerNumber = pNum;
        this.playerHearts = pHearts;
    }


    //    Getters
    public int getPlayerNumber(){
        return playerNumber;
    }

    public int getPlayerHearts(){
        return playerHearts;
    }

    public boolean getPlayerDead(){
        return playerDead;
    }

    //     Setters
    public void setPlayerNumber(int pNum){
        this.playerNumber = pNum;
    }

    public void setPlayerHearts(int pHearts){
        this.playerHearts = pHearts;
    }

    public void setPlayerDead(boolean dead){
        this.playerDead = dead;
    }


}
