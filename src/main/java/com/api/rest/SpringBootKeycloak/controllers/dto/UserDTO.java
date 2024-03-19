package com.api.rest.SpringBootKeycloak.controllers.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Value
@RequiredArgsConstructor
@Builder
public class UserDTO implements Serializable {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Set<String> roles;
}
