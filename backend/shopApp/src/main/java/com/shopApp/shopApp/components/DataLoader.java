package com.shopApp.shopApp.components;


import com.shopApp.shopApp.models.Customer;
import com.shopApp.shopApp.models.Order;
import com.shopApp.shopApp.models.OrderProduct;
import com.shopApp.shopApp.models.Product;

import com.shopApp.shopApp.repository.*;
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
    ProductRepository productRepository;

    @Autowired
    OrderProductRepository orderProductRepository;
//
//    @Autowired
//    OrderProductPKRepository orderProductPKRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {


//        create and save 7 items
        Product item1 = new Product("Nike","Air Jordan 1",9.0,50.00,85.95,"image");
        productRepository.save(item1);

        Product item2 = new Product("Nike","Air Force One",5.0,55.00,75.00,"image");;
        productRepository.save(item2);

        Product item3 = new Product("Nike","Air Air VapourMax",7.0,60.00,130.00,"image");;
        productRepository.save(item3);


        Product item4 = new Product("Adidas","Gazelle",10.0,50.00,89.00,"image");
        productRepository.save(item4);

        Product item5 = new Product("Adidas","Yeezy Powerphase",8.0,400.00,600.00,"image");
        productRepository.save(item5);


        Product item6 = new Product("Adidas","By Pharrel",8.0,60.00,90.00,"image");
        productRepository.save(item6);


        Product item7 = new Product("Converse","Chuck Taylor",9.0,35.00,70.00,"image");
        productRepository.save(item7);



//        create three customers
        Customer augustas = new Customer("auggy3k", "ddd2", "Augustas", "Juskevicius","auggy@xcode.com", "G41 1AJ");
        customerRepository.save(augustas);
        Customer kevin = new Customer("kevIN", "dddssax32d2", "Kevin", "Archer","bigboy@xcode.com", "G43 5KJ");
        customerRepository.save(kevin);
        Customer peter = new Customer("mrSnowBall", "123", "Peter", "Cygan","notanemail@gmail.com", "G2 2AJ");
        customerRepository.save(peter);


//        create 4 full orders
        Order order_gus = new Order(augustas);
        orderRepository.save(order_gus);

        OrderProduct order_prod_gus = new OrderProduct(order_gus, item1, 1);
        orderProductRepository.save(order_prod_gus);

        OrderProduct order_prod2_gus = new OrderProduct(order_gus, item2, 2);
        orderProductRepository.save(order_prod2_gus);

    }
}
