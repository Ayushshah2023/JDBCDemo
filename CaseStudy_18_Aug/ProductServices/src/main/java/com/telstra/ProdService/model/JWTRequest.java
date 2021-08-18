package com.telstra.ProdService.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTRequest {

    String username;
    String password;
}
