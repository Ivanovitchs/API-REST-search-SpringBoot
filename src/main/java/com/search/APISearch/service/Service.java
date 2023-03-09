package com.search.APISearch.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.data.jpa.domain.Specification;

import com.search.APISearch.model.Exeldata;

import jakarta.persistence.criteria.Predicate;


public class Service {

	public static Specification<Exeldata> getdata(String code, String category, String taxe){
		return ((root,query,cricteriaBuider)->{
			List<Predicate> predicate= new ArrayList<>(); 
			
			if(code!=null&& !(code.isEmpty())) {
				predicate.add(cricteriaBuider.equal(root.get("code"), code));
			}
			if(category!=null&& !(category.isEmpty())) {
				predicate.add(cricteriaBuider.equal(root.get("category"), category));
			}
			if(taxe!=null&& !(taxe.isEmpty())) {
				predicate.add(cricteriaBuider.equal(root.get("taxeman"), taxe));
			}
			
			return cricteriaBuider.and(predicate.toArray(new Predicate[0]));
		});
	}
}
