package com.spring.StockMarketCharting.service;

import java.util.List;

import com.spring.StockMarketCharting.model.User;


public interface UserService {
	 public User registerUser(User user) throws Exception;
	 public User updateUser(User user)throws Exception;
	 public List<User> getUserList();
}
