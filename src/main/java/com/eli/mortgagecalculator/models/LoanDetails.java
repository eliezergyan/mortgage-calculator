package com.eli.mortgagecalculator.models;

import com.eli.mortgagecalculator.enums.LoanType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LoanDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double loanAmount;

    private Double annualInterestRate;

    private Integer loanTermYears;

    private LoanType loanType;
}
