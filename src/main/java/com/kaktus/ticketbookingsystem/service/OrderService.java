package com.kaktus.ticketbookingsystem.service;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.kaktus.ticketbookingsystem.dto.request.OrderRequestDto;
import com.kaktus.ticketbookingsystem.dto.response.EventResponseDto;
import com.kaktus.ticketbookingsystem.dto.response.OrderDto;
import com.kaktus.ticketbookingsystem.entity.Order;
import com.kaktus.ticketbookingsystem.entity.Ticket;
import com.kaktus.ticketbookingsystem.mapper.OrderMapper;
import com.kaktus.ticketbookingsystem.repository.OrderRepository;
import com.kaktus.ticketbookingsystem.repository.TicketRepository;
import com.kaktus.ticketbookingsystem.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final OrderMapper orderMapper;
    private final TicketRepository ticketRepository;

    public OrderDto createOrder(OrderRequestDto requestDto) {
        List<Ticket> all = ticketRepository.findAll();
        Order order = orderMapper.toOrder(requestDto);
        if (order.getTickets().size() > all.size()) {
            throw new RuntimeException("not enough tickets");
        }


        Order save = orderRepository.save(order);
        return orderMapper.orderToOrderDto(save);
    }

    public OrderDto getOrderByUserId(UUID id) {
        Order byUser = orderRepository.findByUser(userRepository.findById(id).orElseThrow()).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return orderMapper.orderToOrderDto(byUser);
    }
}
