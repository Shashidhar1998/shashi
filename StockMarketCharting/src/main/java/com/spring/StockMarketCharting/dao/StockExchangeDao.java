package com.spring.StockMarketCharting.dao;

import java.util.List;

import com.spring.StockMarketCharting.model.StockExchange;


public interface StockExchangeDao {
	public StockExchange insertStock(StockExchange stockEx);
	public List<StockExchange> GetAllStock();
}
