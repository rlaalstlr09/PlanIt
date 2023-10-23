package com.planner.back.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="moneyManager")
@Table(name="moneyManager")

public class MoneyManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private String email;
    private int inMoney;
    private int outMoney;
    private String place;
    private int headCount;
}