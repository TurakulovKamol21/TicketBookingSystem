package com.kaktus.ticketbookingsystem.controller;

import com.kaktus.ticketbookingsystem.dto.response.ApiResponse;
import com.kaktus.ticketbookingsystem.dto.request.OrderRequestDto;
import com.kaktus.ticketbookingsystem.dto.response.OrderDto;
import com.kaktus.ticketbookingsystem.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<ApiResponse> createOrder(@RequestBody OrderRequestDto requestDto) {
        return ResponseEntity.ok(ApiResponse.builder()
                .message("success")
                .status(HttpStatus.CREATED)
                .build());
    }


    @GetMapping("/users/{userId}/order")
    public ResponseEntity<OrderDto> getOrderByUserId(@PathVariable UUID userId) {
        return ResponseEntity.ok(orderService.getOrderByUserId(userId));
    }


}
