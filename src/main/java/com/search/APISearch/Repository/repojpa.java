package com.search.APISearch.Repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.APISearch.model.Exeldata;

@Repository
public interface repojpa extends JpaRepository<Exeldata, String> {

	List<Exeldata> findAll(Specification<Exeldata> specification);

	
}
