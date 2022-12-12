package com.medical.medicalshopmanagementsystem.Service;

import com.medical.medicalshopmanagementsystem.entity.AuthenticationStatus;
import com.medical.medicalshopmanagementsystem.entity.User;

public interface UserService {

	abstract void insertUser(User user);
	 AuthenticationStatus getStatus(String username,String password);

}
