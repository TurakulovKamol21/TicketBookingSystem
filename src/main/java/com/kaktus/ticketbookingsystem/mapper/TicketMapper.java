package com.kaktus.ticketbookingsystem.mapper;

import com.kaktus.ticketbookingsystem.dto.response.TicketDto;
import com.kaktus.ticketbookingsystem.entity.Ticket;
import com.kaktus.ticketbookingsystem.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketMapper {
    private final EventRepository eventRepository;

    public TicketDto toTicketDto(Ticket ticket) {
        return TicketDto.builder()
                .id(ticket.getId())
                .dateTime(ticket.getDateTime())
                .eventId(ticket.getEvent().getId())
                .rowNumber(ticket.getRowNumber())
                .seatNumber(ticket.getSeatNumber())
                .sector(ticket.getSector())
                .build();
    }

    public Ticket toTicket(TicketDto ticketDto) {
        return Ticket.builder()
                .sector(ticketDto.getSector())
                .rowNumber(ticketDto.getRowNumber())
                .seatNumber(ticketDto.getSeatNumber())
                .event(eventRepository.findById(ticketDto.getEventId()).orElseThrow())
                .build();
    }
}
