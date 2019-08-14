package com.spring.StockMarketCharting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.StockMarketCharting.dao.*;
import com.spring.StockMarketCharting.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

}
