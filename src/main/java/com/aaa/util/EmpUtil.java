package com.aaa.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.aaa.vo.Employee;

public final class EmpUtil {

    private static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return session;
    }

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
    
    /**
     * 获取session中 当前登陆的员工对象
     * @param session
     * @return user
     */
    public static Employee getEmp() {
        return (Employee) getSession().getAttribute("USER");
    }
    
    /***
     * 存储当前登陆员工到 session中
     * @param emp
     */
    public static void setEmp(Employee emp) {
        getSession().setAttribute("USER", emp);
    }

    public static void removeEmp() {
        HttpSession session = getSession();
        session.invalidate();
    }
    
}