package com.suhas.HosSprital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.suhas.HosSprital.entity.Patient;
import com.suhas.HosSprital.repository.PatientRepo;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;


@SpringBootTest
public class PatientTests {

	@Autowired
	private PatientRepo repo;
	
	
	public void testRepo(){
		List<Patient>list = repo.findAll();
		System.out.println(list);
	}
}
