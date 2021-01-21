package com.example.api.common.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.common.pojo.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

	@Transactional
	List<Optional<Patient>> findAllByHospital_id(int hospitalId);

}
