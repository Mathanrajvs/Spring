package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Address {
	@Id
	@GeneratedValue(generator="address_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="address_gen",sequenceName="address_seq",initialValue =100,allocationSize=1)
	Integer addressId;
	@Column(length=20)
	String city;
	@Column(length=20)
	String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	

}
