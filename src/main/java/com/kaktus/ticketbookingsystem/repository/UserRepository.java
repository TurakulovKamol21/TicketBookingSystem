package com.kaktus.ticketbookingsystem.repository;

import com.kaktus.ticketbookingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
