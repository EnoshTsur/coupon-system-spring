package com.enosh.CouponSystem.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enosh.CouponSystem.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long>{

	Optional<Company> findByEmailAndPassword(String email, String password);
	
	boolean existsByEmailAndPassword(String email, String password);
}
