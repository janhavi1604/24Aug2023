package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService itemService;
	
	
	@PostMapping("/item")
	public ResponseEntity<?>addItem(@RequestBody User item)
	{
		itemService.addItem(item);
		
		return new ResponseEntity("item added",HttpStatus.CREATED);
	}
	
	@GetMapping("/item")
	public ResponseEntity<?>getAllItems()
	{
		List<User> itemList=itemService.getAllItems();
		return new ResponseEntity<List<User>>(itemList,HttpStatus.OK);
	
	}
	
	@PatchMapping("/item")
	public ResponseEntity<?>updateItems(@RequestBody User item)
	{
		itemService.updateitem(item);
		return new ResponseEntity("Item updated successfully",HttpStatus.ACCEPTED);
	
	}
	
	@DeleteMapping("/item")
	public ResponseEntity<?>deleteItems(@RequestBody User item)
	{
		itemService.deleteItem(item);
		return new ResponseEntity("Item updated successfully",HttpStatus.ACCEPTED);
	
	}
	
	

}
