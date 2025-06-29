package com.hcl.beans;

public class Address 
{
	private int pincode;
	private String street;
	private String city;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int pincode, String street, String city) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", street=" + street + ", city=" + city + "]";
	}
	

}
