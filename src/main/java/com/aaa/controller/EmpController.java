package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaa.query.EmpQuery;
import com.aaa.service.IEmpService;
import com.aaa.vo.Employee;
import com.aaa.vo.Login;
import com.aaa.vo.Result;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private IEmpService empService;
	
	@RequestMapping("/login")
	public Result empLogin(@RequestBody Login login){
		return empService.empLogin(login);
	}
	
	@RequestMapping("/getPermission")
	public List<Map> getPermission(){
		return empService.getPermission();
	}
	
	@RequestMapping("/getEmp")
	public Map getEmp(@RequestBody EmpQuery query){
		return empService.getEmp(query);
	}
	
	@RequestMapping("/getDeptAndRole")
	public Map getDeptAndRole(){
		return empService.getDeptAndRole();
	}
	
	@RequestMapping("/addEmp")
	public Result addEmp(@RequestBody Employee e){
		return empService.addEmp(e);
	}
	
	@RequestMapping("/deleteEmp")
	public Result deleteEmp(@RequestBody int[] ids){
		return empService.deleteEmp(ids);
	}
	
	@RequestMapping("/getEditEmp")
	public Employee getEditEmp(int id){
		return empService.getEditEmp(id);
	}
	
	@RequestMapping("/editEmp")
	public Result editEmp(@RequestBody Employee e){
		return empService.editEmp(e);
	}

}










