package com.enosh.CouponSystem.dao;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enosh.CouponSystem.entity.Company;
import com.enosh.CouponSystem.repository.CompanyRepository;

@Component
public class CompanyDao {
	
	private CompanyRepository companyRepository;

	@Autowired
	public CompanyDao(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}
	
	public Company save(Company company) throws Exception {
		try {
			return companyRepository.save(company);
		} catch(Exception e) {
			throw new Exception("Company already exists");
		}
	}
	
	public Company deleteById(Long id) throws Exception {
		Optional<Company> maybe = findById(id);
		if (!maybe.isPresent()) {
			throw new Exception("Company does not exists");
		}
		Company deleted = maybe.get();
		companyRepository.delete(deleted);
		return deleted;
	}
	
	public Optional<Company> findById(Long id) {
		return companyRepository.findById(id);
	}
	
	public Optional<Company> findByEmailAndPassword(String email, String password){
		return companyRepository.findByEmailAndPassword(email, password);
	}
	
	public boolean login(String email, String password) {
		return companyRepository.existsByEmailAndPassword(email, password);
	}
}
