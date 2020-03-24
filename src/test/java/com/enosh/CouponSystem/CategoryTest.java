package com.enosh.CouponSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.enosh.CouponSystem.dao.CategoryDao;
import com.enosh.CouponSystem.entity.Category;
import com.enosh.CouponSystem.entity.CategoryName;

@SpringBootTest
//@ActiveProfiles(profiles = "dev")
class CategoryTest {
	
	@Autowired
	private CategoryDao categoryDao;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createOrGet() {
		Category food = categoryDao.createOrGetByName(new Category(CategoryName.FOOD));
		System.out.println(food);
	}

}
