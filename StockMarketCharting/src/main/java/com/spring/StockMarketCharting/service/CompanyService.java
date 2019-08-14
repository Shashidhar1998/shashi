package com.spring.StockMarketCharting.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.StockMarketCharting.model.Company;

public interface CompanyService {
	  public Company insertCompany(Company company) throws Exception;
	    public Company updateCompany(Company company) throws Exception;
		public List<Company> getCompanyList() throws Exception;
}
