package com.palmetto.pizzeria.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.palmetto.pizzeria.dto.request.OrderStatusUpdateRequest;
import com.palmetto.pizzeria.enums.OrderStatus;
import com.palmetto.pizzeria.kafka.producer.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author khangndd
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderProducer producer;

    public void updateProcessingStatus(Integer orderId) {
        try {
            producer.sendStatusUpdate(orderId, OrderStatusUpdateRequest.builder().status(OrderStatus.PROCESSING).build());
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void approveForShipping(Integer orderId) {
        try {
            producer.sendStatusUpdate(orderId, OrderStatusUpdateRequest.builder().status(OrderStatus.SHIPPING).build());
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void reject(Integer orderId, String reason) {
        try {
            producer.sendStatusUpdate(orderId, OrderStatusUpdateRequest.builder()
                    .status(OrderStatus.REJECTED)
                    .reasonForRejection(reason).build());
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
