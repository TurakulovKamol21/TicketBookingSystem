package com.kaktus.ticketbookingsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private UUID userId;
    private List<TicketDto> ticketDto;
    private Integer totalAmount;

}
