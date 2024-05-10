package com.example.cricinformarbackend.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cric_data")
@Entity
public class Match {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    public Match(int matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore,
            String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete,
            MatchStatus status, Date data) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.data = data;
    }

    public Match(){

    }
    private String bowlTeamScore;
    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public String getTeamHeading() {
        return teamHeading;
    }
    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }
    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }
    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }
    public String getBattingTeam() {
        return battingTeam;
    }
    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }
    public String getBattingTeamScore() {
        return battingTeamScore;
    }
    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }
    public String getBowlTeam() {
        return bowlTeam;
    }
    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }
    public String getBowlTeamScore() {
        return bowlTeamScore;
    }
    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }
    public String getLiveText() {
        return liveText;
    }
    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }
    public String getMatchLink() {
        return matchLink;
    }
    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }
    public String getTextComplete() {
        return textComplete;
    }
    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }
    public MatchStatus getStatus() {
        return status;
    }
    public void setStatus(MatchStatus status) {
        this.status = status;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }
    private String liveText;
    private String matchLink;
    private String textComplete;
    @Enumerated
    private MatchStatus status;
    private Date data = new Date(matchId);

}
