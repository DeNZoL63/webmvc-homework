package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.repositories.OrderRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

}
