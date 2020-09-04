package com.fluko.cloud.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluko.cloud.orderservice.entity.OrderEntity;


@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {}

