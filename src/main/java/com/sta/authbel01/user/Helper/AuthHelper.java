package com.sta.authbel01.user.Helper;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthHelper {
    Authentication getAuthentication();
    public String getName();
    public UserDetails getUserDetails();

    public Integer getPrincipalId();
}
