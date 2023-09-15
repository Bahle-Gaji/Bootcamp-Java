/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bahlegaji01.SoccerApp.src.soccer;

/**
 *
 * @author Administrator
 */
public class Team {
    
    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;
    

    public void incPointsTotal( int pointTotal){
        this.pointsTotal += pointTotal;
    }

    public void incGoalsTotal (int goals){
        this.goalsTotal += goals;
    }
    

    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    
    public Team() {}

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    /**
     * 
     * @return the pointTotal
     */
    public int getPointsTotal() {
        return pointsTotal;
    }

    /**
     * 
     * @param pointsTotal the pointTotal to set
     */
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    /**
     * 
     * @return the gaolsTotal
     */
    public int getGoalsTotal() {
        return goalsTotal;
    }

    /**
     * 
     * @param goalsTotal the goalsTotal to set
     */
    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
    
}
