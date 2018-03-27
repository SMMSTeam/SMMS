package com.example.demo.entity;

import java.io.Serializable;

/**
 * 
* @ClassName: Store
* @Description: 门店实体类
* @author 陈亚军
* @date 2018年3月23日 下午2:16:51
*
 */
public class StoreMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6801508508888051777L;
	private String store_id;
	private String store_name;
	private String storeManager_id;
	private String store_address;
	
	public StoreMessage(){
		super();
		
	}
	
	public StoreMessage(String store_id,String store_name,String storeManager_id,String store_address){
		this.store_id = store_id;
		this.store_name = store_name;
		this.store_address = store_address;
		this.storeManager_id = storeManager_id;
		
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStoreManager_id() {
		return storeManager_id;
	}

	public void setStoreManager_id(String storeManager_id) {
		this.storeManager_id = storeManager_id;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	
	public String toString(){
		return "Store [store_id=" + store_id + ",store_name" + store_name + ",store_address" + store_address + ",storeManager_id" + storeManager_id + "]";
		
	}

}
