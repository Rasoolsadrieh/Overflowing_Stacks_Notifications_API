package com.revature.overflowingStacks.util.web.dto;

import com.revature.overflowingStacks.user.User;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class NotificationInitializer {
//
//    private String movieId;
//
//    private String accountEmail;
//
//    public NotificationInitializer() {
//    }
//
//    public NotificationInitializer(String movieId, String accountEmail) {
//        this.movieId = movieId;
//        this.accountEmail = accountEmail;
//    }
//
//    public String getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(String movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getAccountEmail() {
//        return accountEmail;
//    }
//
//    public void setAccountEmail(String accountEmail) {
//        this.accountEmail = accountEmail;
//    }
//}

    private String notiId;
    private String notiCon;
    private String email

    public NotificationInitializer(String notiId, String notiCon, String email) {
        this.notiId = notiId;
        this.notiCon = notiCon;
        this.email = email;
    }

    public String getNotiId() {
        return notiId;
    }

    public void setNotiId(String notiId) {
        this.notiId = notiId;
    }

    public String getNotiCon() {
        return notiCon;
    }

    public void setNotiCon(String notiCon) {
        this.notiCon = notiCon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}