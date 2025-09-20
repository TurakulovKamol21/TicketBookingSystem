package com.kaktus.ticketbookingsystem.service;

import com.kaktus.ticketbookingsystem.dto.request.EventRequest;
import com.kaktus.ticketbookingsystem.dto.response.EventResponseDto;
import com.kaktus.ticketbookingsystem.entity.Event;
import com.kaktus.ticketbookingsystem.mapper.EventMapper;
import com.kaktus.ticketbookingsystem.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public List<EventResponseDto> getAllEvents() {
        return eventRepository.findAll().stream().map(eventMapper::eventToEventResponse).toList();
    }


    public EventResponseDto createEvent(EventRequest eventDto) {
        Event save = eventRepository.save(eventMapper.toEvent(eventDto));
        return eventMapper.eventToEventResponse(save);
    }
}
