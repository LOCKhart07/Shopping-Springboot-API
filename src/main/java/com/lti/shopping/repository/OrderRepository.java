package com.lti.shopping.repository;


import com.lti.shopping.model.OrderItem;
import com.lti.shopping.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
//    no need as of now
}