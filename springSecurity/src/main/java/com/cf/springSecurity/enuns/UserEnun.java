package com.cf.springSecurity.enuns;

import org.springframework.security.core.userdetails.UserDetails;

public enum UserEnun {
    ADMIN("ADMIN"),
    USER("USER");

    private String value;

    UserEnun(String value){

    }
}
