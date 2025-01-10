package com.wecp.progressive.entity;

import javax.persistence.*;
import java.util.Date;

// Since "match" is a reserved word in mysql, using table name as "matches"
@Entity(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
<<<<<<< HEAD

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "first_team_id")
    private Team firstTeam;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "second_team_id")
    private Team secondTeam;
=======
    private int firstTeamId;
    private int secondTeamId;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea

    @Temporal(TemporalType.DATE)
    private Date matchDate;

    private String venue;
    private String result;
    private String status;
<<<<<<< HEAD

    @ManyToOne
    @JoinColumn(name = "winner_team_id")
    private Team winnerTeam;
=======
    private int winnerTeamId;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea

    public Match() {
    }

    public Match(int matchId, int firstTeamId, int secondTeamId, Date matchDate, String venue, String result, String status, int winnerTeamId) {
        this.matchId = matchId;
<<<<<<< HEAD
        this.firstTeam.setTeamId(firstTeamId);
        this.secondTeam.setTeamId(secondTeamId);
=======
        this.firstTeamId = firstTeamId;
        this.secondTeamId = secondTeamId;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
<<<<<<< HEAD
        this.winnerTeam.setTeamId(winnerTeamId);
=======
        this.winnerTeamId = winnerTeamId;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

<<<<<<< HEAD
    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Team getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Team winnerTeam) {
        this.winnerTeam = winnerTeam;
=======
    public int getFirstTeamId() {
        return firstTeamId;
    }

    public void setFirstTeamId(int firstTeamId) {
        this.firstTeamId = firstTeamId;
    }

    public int getSecondTeamId() {
        return secondTeamId;
    }

    public void setSecondTeamId(int secondTeamId) {
        this.secondTeamId = secondTeamId;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
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

<<<<<<< HEAD
=======
    public int getWinnerTeamId() {
        return winnerTeamId;
    }

    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
}