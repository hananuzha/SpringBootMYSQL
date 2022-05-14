package com.genspark.demo.Service;
import com.genspark.demo.Entity.OrderDetails;
import com.genspark.demo.Entity.Product;
import com.genspark.demo.Repositary.OrderDetailsRepository;
import com.genspark.demo.ServiceInterface.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

     @Autowired
     private OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsServiceImpl(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public OrderDetails getOrderDetailsById(int id) {
        Optional<OrderDetails> orderDetails =this.orderDetailsRepository.findById(id);
        if(orderDetails.isPresent())
            return orderDetails.get();
        else {
            throw new IllegalStateException("orderDetailsRepository with id " + id + "does  not exist");
        }    }

    @Override
    public OrderDetails addOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);

    }

    @Override
    public String deleteOrderDetails(int id) {
        this.orderDetailsRepository.deleteById(id);
        return "deleted Successfully";    }
}
