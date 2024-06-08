package com.zerofiltre.parkingbot.model;

public class Vehicul {
    
	private String registrationNumber;
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	private String category;
	@Override
	public String toString() {
		return "Vehicul [registrationNumber=" + registrationNumber + ", category=" + category + "]";
	}
	
	
}
