package com.palmetto.pizzeria.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.palmetto.pizzeria.dto.request.OrderStatusUpdateRequest;
import com.palmetto.pizzeria.utils.MessageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author khangndd
 */
@Component
@RequiredArgsConstructor
public class OrderProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendStatusUpdate(Integer orderId, OrderStatusUpdateRequest request) throws JsonProcessingException {
        kafkaTemplate.send("order.status-changed", orderId.toString(), MessageUtils.convertToJson(request));
    }
}
