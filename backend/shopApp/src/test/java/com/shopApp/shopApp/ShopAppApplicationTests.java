package com.shopApp.shopApp;

import com.shopApp.shopApp.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class ShopAppApplicationTests {





	@Autowired
	OrderRepository orderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveStuff() {
////        cutomer
//		Customer cust1 = new Customer("turbo","bbb","John","Doe","aa@bb.com","Somewhere");
//		customerRepository.save(cust1);
//
//		List<Customer> foundCustomers = customerRepository.findAll();
//		assertEquals(1, foundCustomers.size());
////        stock item
//		StockItem item1 = new StockItem("some","some",20.00, 30.00);
//		stockItemRepository.save(item1);
//		assertEquals(1, stockItemRepository.findAll().size());
//
////      order
//		Order order1 = new Order("today",cust1);
//		orderRepository.save(order1);
//		assertEquals(1, orderRepository.findAll().size());
//
////        order detail
//		OrderDetail order1_detail = new OrderDetail(item1, 10, order1);
//		orderDetailRepository.save(order1_detail);
//		assertEquals(1, orderDetailRepository.findAll().size());
	}



}
