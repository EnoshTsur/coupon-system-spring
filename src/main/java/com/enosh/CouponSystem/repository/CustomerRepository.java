package com.enosh.CouponSystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enosh.CouponSystem.entity.Company;
import com.enosh.CouponSystem.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
