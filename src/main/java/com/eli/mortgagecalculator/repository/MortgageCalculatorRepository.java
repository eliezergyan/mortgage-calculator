package com.eli.mortgagecalculator.repository;

import com.eli.mortgagecalculator.models.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MortgageCalculatorRepository  extends JpaRepository<LoanDetails, Long> {
}
