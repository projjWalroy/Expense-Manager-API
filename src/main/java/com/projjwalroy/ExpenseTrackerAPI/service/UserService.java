package com.projjwalroy.ExpenseTrackerAPI.service;


import com.projjwalroy.ExpenseTrackerAPI.entity.User;
import com.projjwalroy.ExpenseTrackerAPI.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}
