package com.sta.authbel01.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthResponse {

    //@JsonProperty("access_token")
    private String accessToken;

    //@JsonProperty("refresh_token")
    private String refreshToken;

    private boolean mfaEnabled;
    private String secretImageUri;


}
