package com.example.orderservice.service;

import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.model.OrderResponse;
import org.springframework.stereotype.Service;



public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
    
    OrderResponse getAllOrders();

    //OrderResponse getAllOrders();
}
