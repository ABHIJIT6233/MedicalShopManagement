package com.medical.medicalshopmanagementsystem.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.medicalshopmanagementsystem.Service.UserLoginService;
import com.medical.medicalshopmanagementsystem.entity.UserLogin;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v4")
@RestController
public class UserLoginController {

	@Autowired
	UserLoginService userloginService;
	
	@GetMapping("/loginUser")
	public ResponseEntity<Object> validateUserLogin(@RequestBody UserLogin userlogin) 		
	{
		UserLogin ul = userloginService.validateUserLogin(userlogin);
		if (ul==null)
		
		return new ResponseEntity<>("Invalid credentials",HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>("Successful login", HttpStatus.OK);
	}
}
