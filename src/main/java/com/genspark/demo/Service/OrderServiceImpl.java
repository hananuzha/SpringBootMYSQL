package com.genspark.demo.Service;

import com.genspark.demo.Entity.Orders;
import com.genspark.demo.Repositary.OrderRepository;
import com.genspark.demo.ServiceInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Orders getOrdersById(int id) {
        Optional<Orders> orders =this.orderRepository.findById(id);
        if(orders.isPresent())
            return orders.get();
        else {
            throw new IllegalStateException(" Orders with id " + id + "does  not exist");
        }
    }

    @Override
    public Orders addOrders(Orders orders) {
        return this.orderRepository.save(orders);
    }

    @Override
    public Orders updateOrders(Orders orders) {
        return this.orderRepository.save(orders);
    }

    @Override
    public String deleteOrders(int id) {
        this.orderRepository.deleteById(id);
        return "deleted Successfully";    }
}
