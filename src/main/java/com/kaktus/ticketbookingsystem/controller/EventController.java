package com.kaktus.ticketbookingsystem.controller;

import com.kaktus.ticketbookingsystem.dto.request.EventRequest;
import com.kaktus.ticketbookingsystem.dto.response.EventResponseDto;
import com.kaktus.ticketbookingsystem.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EventController {
private final EventService eventService;

    @GetMapping("/events")
    public ResponseEntity<List<EventResponseDto>> getAllEvents() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }




    @PostMapping("/admin/event")
    public ResponseEntity<EventResponseDto> createEventWithTicket(@RequestBody EventRequest eventDto) {
        return ResponseEntity.ok(eventService.createEvent(eventDto));
    }

}
