package com.aaa.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Permission {

	private int id;

	private int parentid;

	private String url;

	private String name;

	private String desc;

	
}
