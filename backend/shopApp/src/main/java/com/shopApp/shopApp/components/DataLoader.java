package com.shopApp.shopApp.components;

import com.shopApp.shopApp.models.Customer;
import com.shopApp.shopApp.models.Order;
import com.shopApp.shopApp.models.Sneaker;
import com.shopApp.shopApp.repository.CustomerRepository;
import com.shopApp.shopApp.repository.OrderRepository;
import com.shopApp.shopApp.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    SneakerRepository sneakerRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer cust1 = new Customer("turbo","bbb","John","Doe","aa@bb.com","Somewhere");
        customerRepository.save(cust1);
        Sneaker item1 = new Sneaker("Nike","001","image",10.00, 20.00,100.00);
        sneakerRepository.save(item1);

        Order order1 = new Order("today",cust1,"no");
        orderRepository.save(order1);
        order1.addSneaker(item1);
        order1.addSneaker(item1);
        order1.addSneaker(item1);
        order1.addSneaker(item1);

        orderRepository.save(order1);







    }
}
