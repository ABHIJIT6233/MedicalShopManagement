package com.medical.medicalshopmanagementsystem.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.medical.medicalshopmanagementsystem.Repository.MedicineRepository;
import com.medical.medicalshopmanagementsystem.entity.Medicine;

public class MedicineService {

	@Autowired
	MedicineRepository medicineRepository;
	//medRepository
	
	@Transactional
	public List<Medicine> fetchMedicines() {
		List<Medicine> medList=medicineRepository.findAll();
		return medList;
		
	}
	@Transactional
	public Medicine saveMedicine(Medicine medicine) {
		
		return medicineRepository.save(medicine);
		
	}
	@Transactional
	public void updateMedicine(Medicine med) {
		medicineRepository.save(med);	
	
	}
	
	@Transactional
	public void deleteMedicine(int medId) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		medicineRepository.deleteById(medId);
	
	}
	@Transactional 
	  public Medicine getMedicine(int id) { 
	  Optional<Medicine> optional= medicineRepository.findById(id);
	  Medicine med=optional.get();
	  return med;
	  

}
}
