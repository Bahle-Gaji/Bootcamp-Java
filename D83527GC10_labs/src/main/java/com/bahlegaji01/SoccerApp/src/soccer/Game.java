/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bahlegaji01.SoccerApp.src.soccer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] gameEvents;
    private LocalDateTime theDateTime;

    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;

    }

    public void playGame() {
        ArrayList<GameEvent> eventList = new ArrayList();
        GameEvent currEvent;
        for (int i = 1; i < 90; i++) {
            if (Math.random() > 0.8) {
                // System.out.println(i);
                currEvent = Math.random() > 0.8 ? new Goal() : new Possession();
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam : awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().getPlayerArray()[(int) Math.random()
                        * currEvent.getTheTeam().getPlayerArray().length]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);

            }
        }

        this.gameEvents = new GameEvent[eventList.size()];
        eventList.toArray(gameEvents);
    }

    public String getDescription() {

        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();

        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "\n"
                + "Date " + this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");

        for (GameEvent currEvent : this.getGoals()) {
            if (currEvent instanceof Goal) {

                if (currEvent.getTheTeam() == homeTeam) {
                    homeTeamGoals++;
                    homeTeam.incGoalsTotal(1);

                } else {
                    awayTeamGoals++;
                    awayTeam.incGoalsTotal(1);
                }
            }

            currEvent.getThePlayer().incGoalsScored();

            returnString.append(currEvent + " after "
                    + currEvent.getTheTime() + " mins by "
                    + currEvent.getThePlayer().getPlayerName() + " of "
                    + currEvent.getTheTeam().getTeamName() +
                    "\n");
        }

        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win!");
            homeTeam.incPointsTotal(2);
        } else {
            returnString.append(awayTeam.getTeamName() + " win!");
            awayTeam.incPointsTotal(2);
        }

        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");

        return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the gameEvents
     */
    public GameEvent[] getGoals() {
        return gameEvents;
    }

    /**
     * @param gameEvents the gameEvents to set
     */
    public void setGoals(GameEvent[] gameEvents) {
        this.gameEvents = gameEvents;
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }
}
