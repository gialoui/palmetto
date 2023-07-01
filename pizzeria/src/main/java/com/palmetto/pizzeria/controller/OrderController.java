package com.palmetto.pizzeria.controller;

import com.palmetto.pizzeria.dto.request.OrderRejectionRequest;
import com.palmetto.pizzeria.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;

    @PutMapping("/{id}/processing")
    public ResponseEntity changeOrderToProcessing(@PathVariable("id") Integer id) {
        service.updateProcessingStatus(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}/shipping")
    public ResponseEntity approveForShipping(@PathVariable("id") Integer id) {
        service.approveForShipping(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}/rejecting")
    public ResponseEntity reject(@PathVariable("id") Integer id, @RequestBody OrderRejectionRequest request) {
        service.reject(id, request.getReason());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
