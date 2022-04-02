package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nation {
    private String id;
    private String nationality;
    private String language;
    private String capital;
    private String national_sport;

    public Nation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNational_sport() {
        return national_sport;
    }

    public void setNational_sport(String national_sport) {
        this.national_sport = national_sport;
    }

    @Override
    public String toString(){
        return "{id="+id +
                ", nationality="+nationality +
                ", language="+language +
                ", capital="+capital +
                ", national sport="+national_sport +
                "}";
    }
}
