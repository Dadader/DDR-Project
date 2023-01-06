package com.ddrproject.order.service.repository;

import com.ddrproject.order.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
