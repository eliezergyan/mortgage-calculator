package com.eli.mortgagecalculator.models.Dto;

import lombok.Data;

@Data
public class MortgageResultDto {
    private double monthlyPayment;

    private double principal;

    private double interest;

    private double totalAmountPaid;
}
