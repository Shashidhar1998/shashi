package com.spring.StockMarketCharting.dao;

import java.util.List;

import com.spring.StockMarketCharting.model.StockPrice;

public interface StockPriceDao {
	public StockPrice insertStock(StockPrice stock);
    public StockPrice updateStock(StockPrice stock);
   public List<StockPrice> getStockPrice();
   
}
