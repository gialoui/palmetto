package com.palmetto.pizzeria.dto.request;

import com.palmetto.pizzeria.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

/**
 * @author khangndd
 */
@Data
@Builder
public class OrderStatusUpdateRequest {
    private OrderStatus status;
    private String reasonForRejection;
}
