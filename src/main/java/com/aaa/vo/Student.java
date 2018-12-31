package com.aaa.vo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  int  id;
	private  String name;
	private  int  age;
	private  boolean sex;
	
    // 对象之间的关联关系
	private  Grade  grade;
	private  List<Tel>  tels;
	
	

}
