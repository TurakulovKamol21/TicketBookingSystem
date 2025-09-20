package com.kaktus.ticketbookingsystem.repository;

import com.kaktus.ticketbookingsystem.entity.Event;
import com.kaktus.ticketbookingsystem.entity.Order;
import com.kaktus.ticketbookingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
    Optional<Order> findByUser(User user);
}
