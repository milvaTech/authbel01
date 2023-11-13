package com.sta.authbel01.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangePwdRequest {

    private String currentPassword;
    private String newPassword;
    private String confirmationPassword;
}
