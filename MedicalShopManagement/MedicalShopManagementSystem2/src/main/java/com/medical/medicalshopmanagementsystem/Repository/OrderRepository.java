package com.medical.medicalshopmanagementsystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.medicalshopmanagementsystem.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{
	Optional<Orders> findByorderdate(String string);
}
