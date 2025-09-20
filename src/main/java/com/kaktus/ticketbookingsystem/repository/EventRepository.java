package com.kaktus.ticketbookingsystem.repository;

import com.kaktus.ticketbookingsystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
