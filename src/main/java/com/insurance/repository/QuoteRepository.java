package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.Quote;
import com.insurance.model.Vehicle;

public interface QuoteRepository  extends JpaRepository<Quote, Integer> {

}
