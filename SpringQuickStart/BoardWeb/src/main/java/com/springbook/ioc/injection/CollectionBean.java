package com.springbook.ioc.injection;

import java.util.Properties;

public class CollectionBean {

// List Ÿ��
//	private List<String> addressList;
//	
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
//	public List<String> getAddressList() {
//		return addressList;
//	}
	
//	Set Ÿ��
//	private Set<String> addressList;
//	
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
//	public Set<String> getAddressList() {
//		return addressList;
//	}
	
//	Map Ÿ��
//	private Map<String, String> addressList;
//	
//	public void setAddressList(Map<String, String> addressList) {
//		this.addressList = addressList;
//	}
//	public Map<String, String> getAddressList() {
//		return addressList;
//	}
	
//	properties Ÿ�� ����
	private Properties addressList;
	public Properties getAddressList() {
		return addressList;
	}
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}

	
	
}