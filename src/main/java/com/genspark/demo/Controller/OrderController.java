package com.genspark.demo.Controller;

import com.genspark.demo.Entity.Orders;
import com.genspark.demo.ServiceInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/", method = { RequestMethod.GET})
    public String home(@RequestParam(value = "name", defaultValue = "world") String name){
        return "hello " + name;
    }

    @GetMapping("/Order")
    public List<Orders> getOrders(){return this.orderService.getAllOrders();}
    @RequestMapping(value = "/Orders/{OrdersId}", method = { RequestMethod.GET})
    public Orders getOrders(@PathVariable("OrdersId") int id){
        return this.orderService.getOrdersById(id);
    }
    @PostMapping("/Orders")
    public Orders addOrders(@RequestBody Orders orders){
        return this.orderService.addOrders(orders);
    }
    @PutMapping("/Orders")
    public Orders updateOrders(@RequestBody Orders orders){
        return this.orderService.updateOrders(orders);
    }
    @DeleteMapping(path="/Orders/{id}")
    public String deleteOrders(@PathVariable("id") int id){
        return this.orderService.deleteOrders(id);
    }


}
