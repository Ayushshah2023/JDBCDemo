package com.telstra.OrderService.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTRequest {

    String username;
    String password;
}
