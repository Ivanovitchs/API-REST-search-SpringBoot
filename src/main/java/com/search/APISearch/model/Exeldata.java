package com.search.APISearch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Exeldata")
public class Exeldata {
	
	@Id
	private String code;
	
	@Column(name = "category")
	private String category;
	
	@Column(name="taxeman")
	private String taxeman;

	public Exeldata(String code, String category, String taxeman) {
		super();
		this.code = code;
		this.category = category;
		this.taxeman = taxeman;
	}

	public Exeldata() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTaxeman() {
		return taxeman;
	}

	public void setTaxeman(String taxeman) {
		this.taxeman = taxeman;
	}
	
	
	
}
