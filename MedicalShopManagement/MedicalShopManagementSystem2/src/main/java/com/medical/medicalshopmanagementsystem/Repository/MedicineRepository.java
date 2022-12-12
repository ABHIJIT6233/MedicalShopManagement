package com.medical.medicalshopmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.medicalshopmanagementsystem.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine ,Integer> {

}
