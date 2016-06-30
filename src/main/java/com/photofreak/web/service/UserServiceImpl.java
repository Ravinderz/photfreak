package com.photofreak.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.photofreak.web.dao.UserDAO;
import com.photofreak.web.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	
	public void saveUser(User user){
		dao.saveUser(user);
	}
	
	public boolean authenticateUser(User user){
		return dao.authenticateUser(user);
	}
}
