package com.ritu.batch9.laibrary.management.Laibrary.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritu.batch9.laibrary.management.Laibrary.Management.System.model.LaibraryManagement;

@Repository
public interface LaibraryManagementRepository extends JpaRepository<LaibraryManagement,Long> {

	void saveAll(LaibraryManagementRepository rc);
	
}
