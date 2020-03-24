package com.enosh.CouponSystem.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enosh.CouponSystem.entity.Category;
import com.enosh.CouponSystem.entity.CategoryName;
import com.enosh.CouponSystem.entity.Company;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	Optional<Category> findByName(CategoryName name);

}
