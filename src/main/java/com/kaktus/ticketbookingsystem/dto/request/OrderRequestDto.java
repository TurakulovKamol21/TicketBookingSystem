package com.kaktus.ticketbookingsystem.dto.request;

import com.kaktus.ticketbookingsystem.dto.response.TicketDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
    @NotBlank(message = "user can't be empty")
    private UUID userId;
    @NotBlank(message = "ticket can't be empty")
    private List<TicketDto> ticketDto;
    private Integer totalAmount;


}
