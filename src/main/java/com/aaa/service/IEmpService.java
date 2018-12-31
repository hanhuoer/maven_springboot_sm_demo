package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.query.EmpQuery;
import com.aaa.vo.Employee;
import com.aaa.vo.Login;
import com.aaa.vo.Result;

public interface IEmpService {

	/**
	 * 用户登录
	 * @param login
	 * @return
	 */
	Result empLogin(Login login);

	/**
	 * 获取当前登录用户的权限
	 * @return
	 */
	List<Map> getPermission();

	/***
	 * 分页 +  搜索 获取员工
	 * @param query
	 * @return
	 */
	Map getEmp(EmpQuery query);

	
	/**
	 * 获取部门数据
	 * @return
	 */
	List<Map> getDept();
    /**
     * 获取 角色信息
     * @return
     */
	List<Map> getRole();
    /**
     * 获取 部门和 角色
     * @return
     */
	Map getDeptAndRole();
    /**
     * 添加员工
     * @param e
     * @return
     */
	Result addEmp(Employee e);
     
	/**
	 * 批量删除员工
	 * @param ids
	 * @return
	 */
	Result deleteEmp(int[] ids);
    /**
     * 
     * 根据id获取员工
     * @param id
     * @return
     */
	Employee getEditEmp(int id);
    /**
     * 修改员工
     * @param e
     * @return
     */
	Result editEmp(Employee e);

}











