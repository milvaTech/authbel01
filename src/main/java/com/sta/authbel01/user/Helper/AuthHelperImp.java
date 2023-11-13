package com.sta.authbel01.user.Helper;

import com.sta.authbel01.user.User;
import com.sta.authbel01.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AuthHelperImp implements  AuthHelper{


    private final UserRepository userRepository;


    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
    public String getName() {
        return getAuthentication().getName();
    }
    public UserDetails getUserDetails() {
        return (UserDetails) getAuthentication().getPrincipal();
    }

    public Integer getPrincipalId(){
        UserDetails userDetails = (UserDetails) getAuthentication().getPrincipal();
        Optional<User> user = userRepository.findByEmail(userDetails.getUsername());
        return user.get().getId();
    }

}
