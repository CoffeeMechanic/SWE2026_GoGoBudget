package edu.ksu.swe2026.model;

public class User {
    private int points = 0;

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}
