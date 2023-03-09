package com.search.APISearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.search.APISearch.Repository.repojpa;
import com.search.APISearch.model.Exeldata;
import com.search.APISearch.service.Service;

@RestController
@RequestMapping("/search/*")
public class dataController {

	@Autowired
	public repojpa excelRepo;
	
	@GetMapping(name = "list")
	public List<Exeldata> list(@RequestParam(value="code",required = false)String code, 
			@RequestParam(value="category",required = false) String category, 
			@RequestParam(value="taxeman",required = false) String taxe){
		Specification<Exeldata> specification=Service.getdata(code, category, taxe);
		
		return excelRepo.findAll(specification);
	}
	
}
