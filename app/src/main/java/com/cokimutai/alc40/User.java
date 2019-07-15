package com.cokimutai.alc40;

/*
*a model class for data
 */
public class User {

    public String track;
    public String country;
    public String email;
    public int phoneNumber;
    public String slackUsername;

    public User(String track, String country, String email, int phoneNumber, String slackUsername) {
        this.track = track;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUsername = slackUsername;
    }
}
