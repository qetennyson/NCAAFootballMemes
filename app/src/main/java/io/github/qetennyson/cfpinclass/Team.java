package io.github.qetennyson.cfpinclass;

/**
 * Created by Scales on 11/28/16.
 */

public class Team {

    private long id;
    private long loses;
    private String mascot;
    private String name;
    private String picture;
    private long wins;


    public long getId() {
        return id;
    }

    public long getLoses() {
        return loses;
    }

    public String getMascot() {
        return mascot;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public long getWins() {
        return wins;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLoses(long loses) {
        this.loses = loses;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", loses=" + loses +
                ", mascot='" + mascot + '\'' +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", wins=" + wins +
                '}';
    }

    public Team(long id, long loses, String mascot, String name, String picture, long wins) {
        this.id = id;
        this.loses = loses;
        this.mascot = mascot;
        this.name = name;
        this.picture = picture;
        this.wins = wins;
    }

    public Team(){}


}
