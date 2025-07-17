package com.example.AUFTBackend.Model.Admin;


import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Schedule {

    @Id
    @SequenceGenerator(name = "seq_name",sequenceName = "seq_name")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_name")
    private int id;
    private int Match_wek_no;
    private String home_team;
    private String away_team;
    private String venue;
    private LocalTime matchTime;
    private String round;

    public Schedule() {
    }

    public Schedule(int id) {
        this.id = id;
    }

    public Schedule(int id, int match_wek_no, String away_team, String home_team, String venue, LocalTime matchTime, String round) {
        this.id = id;
        Match_wek_no = match_wek_no;
        this.away_team = away_team;
        this.home_team = home_team;
        this.venue = venue;
        this.matchTime = matchTime;
        this.round = round;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatch_wek_no() {
        return Match_wek_no;
    }

    public void setMatch_wek_no(int match_wek_no) {
        Match_wek_no = match_wek_no;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getAway_team() {
        return away_team;
    }

    public void setAway_team(String away_team) {
        this.away_team = away_team;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public LocalTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(LocalTime matchTime) {
        this.matchTime = matchTime;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", Match_wek_no=" + Match_wek_no +
                ", home_team='" + home_team + '\'' +
                ", away_team='" + away_team + '\'' +
                ", venue='" + venue + '\'' +
                ", matchTime=" + matchTime +
                ", round='" + round + '\'' +
                '}';
    }
}
