package com.kaktus.ticketbookingsystem.mapper;

import com.kaktus.ticketbookingsystem.dto.request.OrderRequestDto;
import com.kaktus.ticketbookingsystem.dto.response.OrderDto;
import com.kaktus.ticketbookingsystem.entity.Order;
import com.kaktus.ticketbookingsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private final TicketMapper ticketMapper;
    private final UserRepository userRepository;

    public OrderDto orderToOrderDto(Order order) {
        return OrderDto.builder()
                .userId(order.getUser().getId())
                .ticketDto(order.getTickets().stream().map(ticketMapper::toTicketDto).collect(Collectors.toList()))
                .build();
    }

    public Order toOrder(OrderRequestDto requestDto) {
        return Order.builder()
                .user(userRepository.findById(requestDto.getUserId()).orElseThrow())
                .tickets(requestDto.getTicketDto().stream().map(ticketMapper::toTicket).collect(Collectors.toList()))
                .build();
    }
}
