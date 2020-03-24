package com.enosh.CouponSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enosh.CouponSystem.entity.Coupon;
import com.enosh.CouponSystem.repository.CouponRepository;

@Component
public class CouponDao {

	private CouponRepository couponRepository;
	private CategoryDao categoryDao;

	@Autowired
	public CouponDao(CouponRepository couponRepository, CategoryDao categoryDao) {
		this.couponRepository = couponRepository;
		this.categoryDao = categoryDao;
	}
	
	public Coupon save(Coupon coupon) throws Exception {
		if (coupon.getCompany() == null) {
			throw new Exception("Company can not be null");
		}
		
		if (coupon.getCategory() == null) {
			throw new Exception("Category can not be null");			
		}
		
		coupon.setCategory(categoryDao.createOrGetByName(coupon.getCategory()));
		
		try {
			
			return couponRepository.save(coupon);
			
		} catch (Exception e) {
			throw new Exception("Coupon already exists");
		}
	}
	
	
}
