package com.kaktus.ticketbookingsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
private String message;
private HttpStatus status;
}
