package de.biendong.hoang.biendongtunier.models;

/**
 * Created by hoang on 24.11.14.
 */
public class ResultModel {

    private String teamAName;
    private int teamAGoal;
    private String teamBName;
    private int teamBGoal;

    public ResultModel(String teamAName, int teamAGoal, String teamBName, int teamBGoal) {
        this.teamAName = teamAName;
        this.teamAGoal = teamAGoal;
        this.teamBName = teamBName;
        this.teamBGoal = teamBGoal;
    }

    public String getTeamAName() {
        return teamAName;
    }

    public void setTeamAName(String teamAName) {
        this.teamAName = teamAName;
    }

    public int getTeamAGoal() {
        return teamAGoal;
    }

    public void setTeamAGoal(int teamAGoal) {
        this.teamAGoal = teamAGoal;
    }

    public String getTeamBName() {
        return teamBName;
    }

    public void setTeamBName(String teamBName) {
        this.teamBName = teamBName;
    }

    public int getTeamBGoal() {
        return teamBGoal;
    }

    public void setTeamBGoal(int teamBGoal) {
        this.teamBGoal = teamBGoal;
    }
}
