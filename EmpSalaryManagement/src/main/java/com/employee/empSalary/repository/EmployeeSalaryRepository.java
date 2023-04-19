package com.employee.empSalary.repository;

/**
 * @author Jyosthna
 *
 */

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.empSalary.model.EmployeeSalaryModel;

public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalaryModel, Long> {

	List<EmployeeSalaryModel> findAllByFinancialYear(String financialYear);

}