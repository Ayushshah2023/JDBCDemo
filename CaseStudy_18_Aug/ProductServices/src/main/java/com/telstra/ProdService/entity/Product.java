package com.telstra.ProdService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productid;

    private String productname;
}
//eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYyOTMyNjIxNiwiaWF0IjoxNjI5MzA4MjE2fQ.pw8MHmsJZi7nTypp-MmD6FLkwXxki7QjKZ0J0ApEQwGf8Fmg4SoK38Wsz0PjQdEuZwm0Os6lJL5-jOnthm23-g