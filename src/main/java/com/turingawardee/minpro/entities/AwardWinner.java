package com.turingawardee.minpro.entities;

import java.sql.Timestamp;

public class AwardWinner {

    private int id;
    private String name;
    private String AwardedFor;
    private String year;
    private String country;
    private String affiliation;
    private String image;
    private Timestamp timestamp;

    public AwardWinner() {
    }

    public AwardWinner(String name, String awardedFor, String year, String country, String affiliation, String image) {
        this.name = name;
        AwardedFor = awardedFor;
        this.year = year;
        this.country = country;
        this.affiliation = affiliation;
        this.image = image;
    }

    public AwardWinner(int id, String name, String awardedFor, String year, String country, String affiliation, String image) {
        this.id = id;
        this.name = name;
        AwardedFor = awardedFor;
        this.year = year;
        this.country = country;
        this.affiliation = affiliation;
        this.image = image;
    }

    public AwardWinner(int id, String name, String awardedFor, String year, String country, String affiliation, String image, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        AwardedFor = awardedFor;
        this.year = year;
        this.country = country;
        this.affiliation = affiliation;
        this.image = image;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAwardedFor() {
        return AwardedFor;
    }

    public void setAwardedFor(String awardedFor) {
        AwardedFor = awardedFor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
