package com.kaktus.ticketbookingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_table")
public class User extends BaseEntity {
    private String fullName;
    private String phoneNumber;
    @OneToOne(mappedBy = "user")
    private Order order;
}
