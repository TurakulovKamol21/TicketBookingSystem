package com.kaktus.ticketbookingsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
