package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	public void addItem(User item)
	{
	   userRepository.save(item);
	}
	
	
	public void updateitem(User item)
	{
		userRepository.save(item);
	}
	
	public void deleteItem(User item)
	{
		userRepository.delete(item);
	}
	
	
	public List<User> getAllItems()
	{
		ArrayList<User> itemList = new ArrayList();
		
		return userRepository.findAll();
	}
	
	


	

}
