package com.eli.mortgagecalculator.service;

import com.eli.mortgagecalculator.models.Dto.MortgageResultDto;
import com.eli.mortgagecalculator.models.LoanDetails;

import java.util.List;

public interface MortgageCalculatorService {

    MortgageResultDto calculateMortgage(LoanDetails loanDetails);

    List<MortgageResultDto> compareMortgage(List<LoanDetails> loanDetails);
}
