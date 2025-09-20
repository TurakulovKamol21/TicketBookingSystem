package com.kaktus.ticketbookingsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventResponseDto {
    private UUID id;
    private String name;
    private LocalDateTime dateTime;
    private String venue;
    private Integer totalTickets;
    private Integer availableTickets;
    private List<TicketDto> tickets;
}
