package com.anupam.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("a", "a");
		countryOptions.put("b", "b");
		countryOptions.put("c", "c");
		countryOptions.put("d", "d");
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] operatingSystems;
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	private LinkedHashMap<String, String> countryOptions;
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
 

}
