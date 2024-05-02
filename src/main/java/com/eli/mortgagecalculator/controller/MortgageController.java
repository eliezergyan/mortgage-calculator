package com.eli.mortgagecalculator.controller;


import com.eli.mortgagecalculator.exceptions.MortgageCalculatorException;
import com.eli.mortgagecalculator.models.Dto.MortgageResultDto;
import com.eli.mortgagecalculator.models.LoanDetails;
import com.eli.mortgagecalculator.service.MortgageCalculatorServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/mortgage" )
public class MortgageController {
    private final MortgageCalculatorServiceImpl mortgageCalculatorService;

    public MortgageController (MortgageCalculatorServiceImpl mortgageCalculatorService) {
        this.mortgageCalculatorService = mortgageCalculatorService;
    }

    @PostMapping( "/calculate" )
    public MortgageResultDto calculateMortgage (@RequestBody LoanDetails loanDetails) {
        try {
            return mortgageCalculatorService.calculateMortgage( loanDetails);
        } catch ( Exception e ) {
            throw new MortgageCalculatorException( e.getMessage() );
        }
    }

    @PostMapping("/compare")
    public List<MortgageResultDto> compareMortgage(@RequestBody List<LoanDetails> loanDetails) {
        try {
            return mortgageCalculatorService.compareMortgage(loanDetails);
        } catch (Exception e) {
            throw new MortgageCalculatorException(e.getMessage());
        }
    }
}
