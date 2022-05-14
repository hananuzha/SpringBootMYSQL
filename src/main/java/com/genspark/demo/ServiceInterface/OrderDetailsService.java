package com.genspark.demo.ServiceInterface;

import com.genspark.demo.Entity.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetails> getAllOrderDetails();
    OrderDetails getOrderDetailsById(int id);
    OrderDetails addOrderDetails(OrderDetails orderDetails);
    OrderDetails updateOrderDetails(OrderDetails orderDetails);
    String deleteOrderDetails(int id);
}
