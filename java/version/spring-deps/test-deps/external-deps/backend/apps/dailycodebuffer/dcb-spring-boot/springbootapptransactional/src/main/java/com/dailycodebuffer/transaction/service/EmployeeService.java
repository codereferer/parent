package com.dailycodebuffer.transaction.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.transaction.entity.Department;
import com.dailycodebuffer.transaction.entity.Employee;
import com.dailycodebuffer.transaction.repository.DepartmentRepository;
import com.dailycodebuffer.transaction.repository.EmployeeRepository;
import com.dailycodebuffer.transaction.vo.EmployeeRequestVO;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

	@Transactional
    public String saveEmployee(EmployeeRequestVO employeeRequestVO) {

        Department department  = Department.builder()
							        	   .departmentName(employeeRequestVO.getDepartmentName())
							        	   .departmentCode(employeeRequestVO.getDepartmentName())
							        	   .build();

        Long departmentId = departmentRepository.save(department)
                            					.getDepartmentId();

        Employee  employee = Employee.builder()
					        		 .empName(employeeRequestVO.getEmpName())
					        		 .email(employeeRequestVO.getEmail())
					        		 .departmentId(departmentId)
					        		 .build();
        
//        Employee employee = null;

        employeeRepository.save(employee);

        return "Employee is saved with Employee ID :" + employee.getEmployeeId();
    }
}
