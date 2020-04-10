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
        Product item1 = new Product("Cup", 20.00,25.00,"link");
        productRepository.save(item1);


        Product item2 = new Product("Bra", 65.00,100.00,"link");
        productRepository.save(item2);

        Product item3 = new Product("TV", 500.00,1250.00,"link");
        productRepository.save(item3);

        Product item4 = new Product("Beattles LP", 27.00,35.00,"link");
        productRepository.save(item4);

        Product item5 = new Product("Toilet roll", 3.00,29.00,"link");
        productRepository.save(item5);

        Product item6 = new Product("Bear Trap", 22.00,35.00,"link");
        productRepository.save(item6);

        Product item7 = new Product("Mouse", 15.00,30.00,"link");
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

        OrderProduct order_prod_gus = new OrderProduct(order_gus, item1, 20);
        orderProductRepository.save(order_prod_gus);

        OrderProduct order_prod2_gus = new OrderProduct(order_gus, item2, 20);
        orderProductRepository.save(order_prod2_gus);





//        Order basket = new Order();
//        orderRepository.save(basket);
//
//
//        OrderProduct orderproduct1 = new OrderProduct(basket, item1, 20);
//        orderProductRepository.save(orderproduct1);
//
////        basket.addOrderProduct(orderproduct1);
////        orderRepository.save(basket);
//
//        OrderProduct ordprod2 = new OrderProduct(basket, item2, 40);
//        orderProductRepository.save(ordprod2);

//        orderRepository.save(basket)
    }
}
