package com.space.entity;

public class JwtResponse {

    private AppUser appUser;
    private String jwtToken;

    public JwtResponse(AppUser appUser, String jwtToken) {
        this.appUser = appUser;
        this.jwtToken = jwtToken;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
