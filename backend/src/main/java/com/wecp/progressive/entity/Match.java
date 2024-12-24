package com.wecp.progressive.entity;

import java.sql.Date;

public class Match {

    private int matchId;
    private int firstTeam;
    private int  secondTeam;
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    private String winnerTeam;

    public Match() {
    }

    public Match(int matchId, int firstTeam, int secondTeam, Date matchDate, String venue, String result, String status,
            String winnerTeam) {
        this.matchId = matchId;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeam = winnerTeam;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(int firstTeam) {
        this.firstTeam = firstTeam;
    }

    public int getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(int secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(String winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

}