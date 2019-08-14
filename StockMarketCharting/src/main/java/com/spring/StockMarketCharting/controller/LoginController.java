package com.spring.StockMarketCharting.controller;

import org.springframework.ui.ModelMap;

import com.spring.StockMarketCharting.model.Login;

public interface LoginController {
	public String login(ModelMap model);
	public String loginconnect(Login login,ModelMap model);
	
}
