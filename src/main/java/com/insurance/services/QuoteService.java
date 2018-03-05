package com.insurance.services;

import java.util.List;

import com.insurance.model.Quote;

/**
 * Created by jt on 1/10/17.
 */
public interface QuoteService {

    void sendQuoteMessage(Quote quote);
}
