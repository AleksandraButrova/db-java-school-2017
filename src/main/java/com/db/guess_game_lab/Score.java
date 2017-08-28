package com.db.guess_game_lab;

public class Score {
    String name;
    double score;

    public Score(String name, double score){
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return name + " " + score;
    }

    public double getScore(){
        return score;
    }

    public void setNameAndScore(String name, double score){
        this.name = name;
        this.score = score;
    }
}
