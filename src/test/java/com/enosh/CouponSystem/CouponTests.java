package com.enosh.CouponSystem;

import java.security.cert.PKIXRevocationChecker.Option;
import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.enosh.CouponSystem.dao.CompanyDao;
import com.enosh.CouponSystem.dao.CouponDao;
import com.enosh.CouponSystem.entity.Category;
import com.enosh.CouponSystem.entity.CategoryName;
import com.enosh.CouponSystem.entity.Company;
import com.enosh.CouponSystem.entity.Coupon;

@SpringBootTest
class CouponTests {
	
	@Autowired
	private CouponDao couponDao;
	
	@Autowired
	private CompanyDao companyDao;

	@Test
	void contextLoads() {
	}
	
	@Test
	void create() {
		Optional<Company> compById = companyDao.findById(1L);
		if (compById.isPresent()) {
			
			Company it = compById.get();
			
			Coupon coupon = new Coupon( 
					new Category(CategoryName.SPORT), 
					it,
					"aroma cool",
					"nice tea",
					LocalDate.now(),
					LocalDate.now().plusYears(1),
					100,
					29.90,
					"http://www.c.com/a.png"
			);
			
			try {
				System.out.println(couponDao.save(coupon));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
