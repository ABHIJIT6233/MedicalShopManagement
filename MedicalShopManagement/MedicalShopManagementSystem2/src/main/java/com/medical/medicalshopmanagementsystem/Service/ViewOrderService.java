package com.medical.medicalshopmanagementsystem.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medicalshopmanagementsystem.Repository.OrderRepository;
import com.medical.medicalshopmanagementsystem.entity.Orders;

@Service
public class ViewOrderService {

	@Autowired
	//TransactionsRepository transactionsRepository;
	//ItemsRepository itemsRepository;
	OrderRepository orderRepository;
	//orderRep
	
	@Transactional
    public List<Orders> fetchorders() {
	// TODO Auto-generated method stub
	List<Orders> orderList=orderRepository.findAll();
	return orderList;
	}
	
	@Transactional
	public Orders saveorder(Orders view) {
		
		return orderRepository.save(view);
		
	}
	@Transactional
	public void updateorder(Orders view) {
		orderRepository.save(view);	
	
	}
	
	@Transactional
	public void deleteorder(int orderid) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		orderRepository.deleteById(orderid);
	
	}
	@Transactional 
	  public Orders getorder(int orderid) { 
	  Optional<Orders> optional= orderRepository.findById(orderid);
	  Orders vieworder=optional.get();
	  return vieworder;
	  

}
}
