package com.sqlJoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sqlJoin.dto.OrderRequest;
import com.sqlJoin.dto.OrderResponse;
import com.sqlJoin.entity.Customer;
import com.sqlJoin.entity.Product;
import com.sqlJoin.repository.CustomerRepository;
import com.sqlJoin.repository.ProductRepository;


@RestController
public class OrderController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/place")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}
	
//	@PostMapping("/place")
//	public Customer placeOrder(@RequestBody Customer c)
//	{
//		return customerRepository.save(c);
//	}
	
	@GetMapping("/findorder")
	public List<Customer> findAllOrder()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/findorderselect")
	public List<OrderResponse> getJoinInformation1()
	{
		return customerRepository.getJoinInformation();
	}
	
	
	@GetMapping("/ppp/{pid}")
	public List<Product> getProduct(@PathVariable ("pid") int pid)
	{
		return productRepository.findAllByPid(pid);
	}
	
	
	@GetMapping("/right")
	public List<OrderResponse> getJoinInformation2()
	{
		return customerRepository.getJoinInformation12();
	}
	
	@GetMapping("/left")
	public List<OrderResponse> getJoinInformation()
	{
		return customerRepository.getleftjoin();
	}
	
	@GetMapping("/inner")
	public List<OrderResponse> getJoinInformation3()
	{
		return customerRepository.getInnerJoin();
	}
	
	

}
