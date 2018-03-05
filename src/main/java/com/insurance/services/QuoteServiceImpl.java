package com.insurance.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.CarInsuranceApplication;
import com.insurance.model.Quote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class QuoteServiceImpl implements QuoteService {

    private static final Logger log = LoggerFactory.getLogger(QuoteServiceImpl.class);

    private RabbitTemplate rabbitTemplate;


    @Override
    public void sendQuoteMessage(Quote quote) {
        Map<String, Quote> actionmap = new HashMap<>();
        actionmap.put("quote", quote);
        log.info("Sending the index request through queue message");
        rabbitTemplate.convertAndSend(CarInsuranceApplication.SFG_MESSAGE_QUEUE, actionmap);
    }
}
