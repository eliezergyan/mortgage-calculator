package com.eli.mortgagecalculator.controller;


import com.eli.mortgagecalculator.exceptions.MortgageCalculatorException;
import com.eli.mortgagecalculator.models.Dto.MortgageResultDto;
import com.eli.mortgagecalculator.models.LoanDetails;
import com.eli.mortgagecalculator.service.MortgageCalculatorServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class MortgageController {
    private final MortgageCalculatorServiceImpl mortgageCalculatorService;

    public MortgageController (MortgageCalculatorServiceImpl mortgageCalculatorService) {
        this.mortgageCalculatorService = mortgageCalculatorService;
    }

    @GetMapping("/")
    public String viewMortgage(){
            return "Hello world";
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
