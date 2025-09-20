package com.kaktus.ticketbookingsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {
    private UUID id;
    private String sector;
    private Integer rowNumber;
    private Integer seatNumber;
    private LocalDateTime dateTime;
    private UUID eventId;
}
