package com.medical.medicalshopmanagementsystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.medicalshopmanagementsystem.entity.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, String>{
	@Query("SELECT ul FROM UserLogin ul WHERE ul.userid =?1 and ul.password=?2")
			public UserLogin validateUserLogin(int userid,String password);





	public Optional<UserLogin> findByPassword(String string);



}
