package io.github.kamilszewc.twofactorclient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Entry {
    private String serviceName;
    private String userName;
    private String secret;
    private String issuer;
    private String algorithm;

    public int getCode() {
        return 333333;
    }

    public String toString() {
        return serviceName + " " + getCode() + " " + LocalDateTime.now();
    }

}