package com.spring.StockMarketCharting.dao;

import java.util.List;

import com.spring.StockMarketCharting.model.IPOPlaned;

public interface IPOPlanedDao {
 public IPOPlaned Insert(IPOPlaned ipo);
 public List<IPOPlaned> GetAllIPOPlaned(); 
}
