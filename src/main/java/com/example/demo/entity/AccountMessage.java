package com.example.demo.entity;

import java.io.Serializable;

/**
 * 
* @ClassName: AccountMessage
* @Description: 用户账户实体类
* @author 陈亚军
* @date 2018年3月23日 下午3:03:01
*
 */

public class AccountMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9096117555513301815L;
	private String staff_id;
	private String staff_password;
	private int staff_permissions;
	
	public AccountMessage(){
		super();
	}
	
	public AccountMessage(String staff_id,String staff_password,int staff_permissions){
		super();
		this.staff_id = staff_id;
		this.staff_password = staff_password;
		this.staff_permissions = staff_permissions;
		
		
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_password() {
		return staff_password;
	}

	public void setStaff_password(String staff_password) {
		this.staff_password = staff_password;
	}

	public int getStaff_permissions() {
		return staff_permissions;
	}

	public void setStaff_permissions(int staff_permissions) {
		this.staff_permissions = staff_permissions;
	}
	

}
