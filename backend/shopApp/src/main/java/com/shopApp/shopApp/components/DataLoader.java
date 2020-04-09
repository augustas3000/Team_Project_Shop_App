package com.shopApp.shopApp.components;

import com.shopApp.shopApp.models.Customer;
import com.shopApp.shopApp.models.Order;
import com.shopApp.shopApp.models.OrderDetail;
import com.shopApp.shopApp.models.StockItem;
import com.shopApp.shopApp.repository.CustomerRepository;
import com.shopApp.shopApp.repository.OrderDetailRepository;
import com.shopApp.shopApp.repository.OrderRepository;
import com.shopApp.shopApp.repository.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    StockItemRepository stockItemRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer cust1 = new Customer("turbo","bbb","John","Doe","aa@bb.com","Somewhere");
        customerRepository.save(cust1);

        StockItem item1 = new StockItem("some","some",20.00, 100.00, 30);
        stockItemRepository.save(item1);

        Order order1 = new Order("today",cust1);
        orderRepository.save(order1);

        OrderDetail order1_detail = new OrderDetail(item1, 10, order1);
        orderDetailRepository.save(order1_detail);


    }
}
