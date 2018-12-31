package com.aaa.mapper;

import java.util.List;
import java.util.Map;

import com.aaa.query.EmpQuery;
import com.aaa.vo.Employee;
import com.aaa.vo.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpMapper {

    Integer empLogin(Login login);

    Employee getEmpByLoginID(Integer id);

    List<Map> getPermission(int roleID);

    List<Map> getEmp(EmpQuery query);

    Integer getEmpTotal(EmpQuery query);

    List<Map> getDept();

    List<Map> getRole();

    void addLoginAccount(Login login);

    void addEmp(Employee e);

    void deleteEmp(int[] ids);

    Employee getEmpByID(int id);

    void editEmp(Employee e);
}
