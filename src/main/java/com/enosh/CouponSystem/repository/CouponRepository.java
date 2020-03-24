package com.enosh.CouponSystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enosh.CouponSystem.entity.Company;
import com.enosh.CouponSystem.entity.Coupon;

@Repository
public interface CouponRepository extends CrudRepository<Coupon, Long>{

}
