package com.telstra.OrderService.repository;

import com.telstra.OrderService.entity.Orderss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orderss, Long> {

    //@Query("FROM User WHERE username = ?1")
    //List<Orderss> findByName(String username);
    //Agar galti nikla then isko waapis username kar dena hai
}
