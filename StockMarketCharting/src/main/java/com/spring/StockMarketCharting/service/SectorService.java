package com.spring.StockMarketCharting.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.StockMarketCharting.model.Sector;

public interface SectorService {
	public Sector Insert (Sector sector)throws ClassNotFoundException, SQLException;
	public List<Sector> GetAllSector()throws ClassNotFoundException, SQLException;
}
