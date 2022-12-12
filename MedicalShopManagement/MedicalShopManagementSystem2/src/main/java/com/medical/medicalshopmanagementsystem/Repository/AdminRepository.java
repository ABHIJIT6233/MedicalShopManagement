package com.medical.medicalshopmanagementsystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.medicalshopmanagementsystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	@Query("SELECT a FROM Admin a WHERE a.adminid =?1 and a.password=?2")
	public Admin validateAdmin(int adminid,String password);

public Optional<Admin> findByPassword(String string);


}
