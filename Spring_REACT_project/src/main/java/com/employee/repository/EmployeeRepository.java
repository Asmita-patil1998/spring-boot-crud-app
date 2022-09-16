package com.employee.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Modifying
    @Transactional
    @Query(value = "UPDATE employees SET img_url =? WHERE id=?", nativeQuery = true)
    void updateUrl(String url,Long id);

}
