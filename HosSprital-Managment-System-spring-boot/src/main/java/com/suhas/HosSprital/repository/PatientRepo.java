package com.suhas.HosSprital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suhas.HosSprital.entity.Patient;

public interface PatientRepo  extends JpaRepository<Patient, Long> {
	

}
