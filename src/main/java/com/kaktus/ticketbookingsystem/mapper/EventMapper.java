package com.kaktus.ticketbookingsystem.mapper;

import com.kaktus.ticketbookingsystem.dto.request.EventRequest;
import com.kaktus.ticketbookingsystem.dto.response.EventResponseDto;
import com.kaktus.ticketbookingsystem.entity.Event;
import com.kaktus.ticketbookingsystem.entity.Ticket;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EventMapper {

    private final TicketMapper ticketMapper;

    public EventMapper(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    public EventResponseDto eventToEventResponse(Event  event) {
return EventResponseDto.builder()
        .id(event.getId())
        .name(event.getName())
        .venue(event.getVenue())
        .availableTickets(event.getAvailable_tickets())
        .dateTime(event.getDateTime())
        .tickets(event.getTickets().stream().map(ticketMapper::toTicketDto).collect(Collectors.toList()))
        .build();
}


    public Event toEvent(EventRequest eventDto) {
    return Event.builder()
            .available_tickets(eventDto.getAvailableTickets())
            .dateTime(eventDto.getDateTime())
            .name(eventDto.getName())
            .venue(eventDto.getVenue())
            .tickets(eventDto.getTickets().stream().map(ticketMapper::toTicket).collect(Collectors.toList()))
            .build();
    }
}
