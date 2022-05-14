package com.genspark.demo.ServiceInterface;


import com.genspark.demo.Entity.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getAllOrders();
    Orders getOrdersById(int id);
    Orders addOrders(Orders orders);
    Orders updateOrders(Orders orders);
    String deleteOrders(int id);
}
