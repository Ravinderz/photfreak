package com.photofreak.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.photofreak.web.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional
	public void saveUser(User user){
		getSession().saveOrUpdate(user);
	}
	
	public boolean authenticateUser(User user){
		
		List<User> userList = getSession().createQuery("from User where username = :username and password = :password").setParameter("username", user.getUsername()).setParameter("password",user.getPassword()).list();
		//user = (User)getSession().createCriteria(User.class,"user").add(Restrictions.eq("user.username", username)).add(Restrictions.eq("user.password", password)).uniqueResult();
		if(userList.size() > 0){//getting null pointer exception
			System.out.println("username :: "+user.getUsername());
			System.out.println("password :: "+user.getPassword());
			System.out.println("userID :: "+user.getUserId());
			return true;
		}
		return false;
	}
}
