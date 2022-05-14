package com.genspark.demo.Controller;

import com.genspark.demo.Entity.OrderDetails;
import com.genspark.demo.Entity.Orders;
import com.genspark.demo.ServiceInterface.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;
    @GetMapping("/OrderDetails")
    public List<OrderDetails> getOrderDetails(){return this.orderDetailsService.getAllOrderDetails();}
    @GetMapping("/OrderDetails/{OrderDetailsId}")
    public OrderDetails getOrderDetailsById(@PathVariable("OrderDetailsId") int id){
        return this.orderDetailsService.getOrderDetailsById(id);
    }
    @PostMapping("/OrderDetails")
    public OrderDetails addOrderDetails(@RequestBody OrderDetails orderDetails){
        return this.orderDetailsService.addOrderDetails(orderDetails);
    }
    @PutMapping("/OrderDetails")
    public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderDetails){
        return this.orderDetailsService.updateOrderDetails(orderDetails);
    }
    @DeleteMapping(path="/OrderDetails/{id}")
    public String deleteOrderDetails(@PathVariable("id") int id){
        return this.orderDetailsService.deleteOrderDetails(id);
    }



}
