package com.kaktus.ticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Ticket extends BaseEntity{
    private String sector;
    private Integer rowNumber;
    private Integer seatNumber;
    private LocalDateTime dateTime;
    @ManyToMany(mappedBy = "tickets")
    private List<Order> orders;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

}
