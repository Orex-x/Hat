package com.example.hat.models;

public class Group {
    private String name;
    private int score;

    public int getScore() {
        return score;
    }

    public void increaseScore(){
        score++;
    }

    public void decreaseScore(){
        if(score > 0)
            score--;
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
