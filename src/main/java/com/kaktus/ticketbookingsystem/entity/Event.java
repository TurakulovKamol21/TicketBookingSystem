package com.kaktus.ticketbookingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
public class Event extends BaseEntity {
    private String name;
    private LocalDateTime dateTime;
    private String venue;
    private Integer total_tickets;
    private Integer available_tickets;
    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

}
