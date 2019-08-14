package com.spring.StockMarketCharting.dao;


import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.StockMarketCharting.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{
	
}
