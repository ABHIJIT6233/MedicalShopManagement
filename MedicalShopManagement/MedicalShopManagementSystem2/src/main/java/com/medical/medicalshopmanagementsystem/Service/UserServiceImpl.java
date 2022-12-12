package com.medical.medicalshopmanagementsystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medicalshopmanagementsystem.Repository.UserRepository;
import com.medical.medicalshopmanagementsystem.entity.AuthenticationStatus;
import com.medical.medicalshopmanagementsystem.entity.User;

@Service
public class  UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
	super();
	this.userRepository = userRepository;
}

	//@Override
	public void insertUser(User user) {
		userRepository.save(user);
	}

	//@Override
	public AuthenticationStatus getStatus(String username, String password) {
		AuthenticationStatus status;
		User user=userRepository.findByUsernameAndPassword(username, password);
		if(user!=null) {
			status=new AuthenticationStatus(user.getUsername(), user.getPassword(), true);
		}
		else
		{
			status=new AuthenticationStatus(null,null,false);
		}
		return status;

	}

}
