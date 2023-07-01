package com.palmetto.pizzeria.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author khangndd
 */
@Data
@Builder
public class OrderRejectionRequest {
    private String reason;
}
