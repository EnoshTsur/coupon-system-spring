package com.enosh.CouponSystem;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import com.enosh.CouponSystem.dao.CompanyDao;
import com.enosh.CouponSystem.entity.Company;

@SpringBootTest
//@ActiveProfiles(profiles = "dev")
class CompanyTests {

	@Autowired
	private CompanyDao companyDao;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void create() {
//		Company company = new Company("teva@gmail.com", "teva", "12345");
//		try {
//			companyDao.save(company);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
	
	@Test
	void findById() {
//		Optional<Company> companyOptional = companyDao.findById(1L);
//		
//		if (companyOptional.isPresent()) {
//			Company company = companyOptional.get();
//			System.out.println(company);
//		}
	}
	
	@Test
	void delete() {
//		try {
//			
//			Company deleted = companyDao.deleteById(3L);
//			System.out.println(deleted);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
	
	@Test
	void update() {
//		Company company = new Company(1L, "aroma2@walla.co.il", "aroma2", "999000");
//		try {
//			companyDao.save(company);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
	}
	
	@Test
	void byNameAndPassword() {
//		companyDao.findByEmailAndPassword("aroma2@walla.co.il", "999000")
//		.ifPresent(System.out::println);
	}
	
	@Test
	void login() {
		boolean isPassed = companyDao.login("aroma2@walla.co.il789789", "999000");
		Assert.isTrue(isPassed, "Bad email or password");
	}

}
