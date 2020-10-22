package com.edsandrof.hrpayroll.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Worker implements Serializable {

    private static final long serialVersionUID = 7952367124783812324L;

    private Long id;
    private String name;
    private Double dailyIncome;
}
