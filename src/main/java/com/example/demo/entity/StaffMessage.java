package com.example.demo.entity;

import java.io.Serializable;
/**
 * 
* @ClassName: StaffMessage
* @Description: 员工信息实体类
* @author 陈亚军
* @date 2018年3月23日 下午3:02:19
*
 */

public class StaffMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7786385429233307953L;
	private String staff_id;
	private String staff_name;
	private int staff_age;
	private String staff_tel;
	private String store_id;
	private String staff_positions;
	
	public StaffMessage(){
		super();
	}
	
	public StaffMessage(String staff_id,String  staff_name,int staff_age,String staff_tel,String store_id,String staff_positions){
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.staff_age = staff_age;
		this.staff_tel = staff_tel;
		this.store_id = store_id;
		this.staff_positions = staff_positions;
		
	}
	public StaffMessage(String staff_id,String staff_tel,String staff_positions){
		super();
		this.staff_id = staff_id;
		this.staff_tel = staff_tel;
		this.staff_positions = staff_positions;
		
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public int getStaff_age() {
		return staff_age;
	}

	public void setStaff_age(int staff_age) {
		this.staff_age = staff_age;
	}

	public String getStaff_tel() {
		return staff_tel;
	}

	public void setStaff_tel(String staff_tel) {
		this.staff_tel = staff_tel;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getStaff_positions() {
		return staff_positions;
	}

	public void setStaff_positions(String staff_positions) {
		this.staff_positions = staff_positions;
	}
	
	@Override
	public String toString(){
		return "Staff [staff_id=" + staff_id + ",staff_name=" + staff_name + ",staff_age=" + staff_age +",staff_tel=" + staff_tel
				+ ",store_id" + store_id + ",staff_positions" +staff_positions +"]" ;
		
	}

}
