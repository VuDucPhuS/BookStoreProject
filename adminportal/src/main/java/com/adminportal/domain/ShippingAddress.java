package com.adminportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ShippingAddressName;
	private String ShippingAddress1;
	private String ShippingAddress2;
	private String ShippingAddressCity;
	private String ShippingAddressState;
	private String ShippingAddressCountry;
	private String ShippingAddressZipcode;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getShippingAddressName() {
		return ShippingAddressName;
	}


	public void setShippingAddressName(String shippingAddressName) {
		ShippingAddressName = shippingAddressName;
	}


	public String getShippingAddress1() {
		return ShippingAddress1;
	}


	public void setShippingAddress1(String shippingAddress1) {
		ShippingAddress1 = shippingAddress1;
	}


	public String getShippingAddress2() {
		return ShippingAddress2;
	}


	public void setShippingAddress2(String shippingAddress2) {
		ShippingAddress2 = shippingAddress2;
	}


	public String getShippingAddressCity() {
		return ShippingAddressCity;
	}


	public void setShippingAddressCity(String shippingAddressCity) {
		ShippingAddressCity = shippingAddressCity;
	}


	public String getShippingAddressState() {
		return ShippingAddressState;
	}


	public void setShippingAddressState(String shippingAddressState) {
		ShippingAddressState = shippingAddressState;
	}


	public String getShippingAddressCountry() {
		return ShippingAddressCountry;
	}


	public void setShippingAddressCountry(String shippingAddressCountry) {
		ShippingAddressCountry = shippingAddressCountry;
	}


	public String getShippingAddressZipcode() {
		return ShippingAddressZipcode;
	}


	public void setShippingAddressZipcode(String shippingAddressZipcode) {
		ShippingAddressZipcode = shippingAddressZipcode;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
