package com.palmetto.pizzeria.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author khangndd
 */
@RequiredArgsConstructor
@Getter
public enum OrderStatus {
    NEW(1), PROCESSING(2), SHIPPING(3), REJECTED(5);

    private final int code;
}
