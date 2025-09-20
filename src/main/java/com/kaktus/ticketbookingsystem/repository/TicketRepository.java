package com.kaktus.ticketbookingsystem.repository;

import com.kaktus.ticketbookingsystem.entity.Event;
import com.kaktus.ticketbookingsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
