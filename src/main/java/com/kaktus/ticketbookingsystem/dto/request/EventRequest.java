package com.kaktus.ticketbookingsystem.dto.request;

import com.kaktus.ticketbookingsystem.dto.response.TicketDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class EventRequest {
    @NotBlank(message = "name can't be empty")
    private String name;
    @NotBlank(message = "dateTime can't be empty")
    private LocalDateTime dateTime;
    @NotBlank(message = "venue can't be empty")
    private String venue;
    private Integer totalTickets;
    private Integer availableTickets;
    @NotBlank(message = "tickets can't be empty")
    private List<TicketDto> tickets;


}
