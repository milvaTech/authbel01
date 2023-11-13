package com.sta.authbel01.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
@RequiredArgsConstructor
public class AuthorizationController {

//    @GetMapping("/userInfo")
//    @PreAuthorize("hasAuthority('admin:read')")
//    public ResponseEntity<String> userInfo() {
//        return ResponseEntity.ok("Display user Info. role ADMIN and authority READ.");
//    }
//
//
//    @PostMapping("/updateUserInfo")
//    @PreAuthorize("hasAuthority('admin:create')")
//    public ResponseEntity<String> updateUserInfo() {
//        return ResponseEntity.ok("Update user info. role ADMIN and authority CREATE.");
//    }
}
