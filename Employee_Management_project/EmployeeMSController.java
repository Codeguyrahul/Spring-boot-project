package com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.Repository.EmployeeMSrepository;
import com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeMSController {
@Autowired
EmployeeMSrepository emr;
@PostMapping("/save")
public void saveEmployee(@RequestBody Employee em) {
	emr.save(em);
	}
@RequestMapping("/details")
public List<Employee> getBooks(){
	return emr.findAll();
}

@RequestMapping("/details/{id}")
public Employee getById(@PathVariable("id")Long id) {
return emr.findById(id).get();
}
@RequestMapping("/update/{id}/{employee_name}")
public void updateEmployee(@PathVariable("id")Long id,@PathVariable("employee_name")String ename) {
	Employee ems = emr.findById(id).get();
	ems.setEmployee_Name(ename);
	emr.save(ems);
	}
//@RequestMapping("/details/{id}")
//public Employee getById(@PathVariable("id")Long id) {
//return emr.findById(id).get();
//}
@RequestMapping("/delete/{id}")
public void deleteEmployee(@PathVariable("id")Long id) {
emr.deleteById(id);
}

}