package com.sliit.ead.countryservice.model;

public class Country {

	private String countryId;	
	private String countryName;	
	private double populationofMillion;	
	private String capital;
	
	public Country() {
		
	}
	
	

	public Country(String countryId, String countryName, double populationofMillion, String capital) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.populationofMillion = populationofMillion;
		this.capital = capital;
	}



	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getPopulationofMillion() {
		return populationofMillion;
	}

	public void setPopulationofMillion(double populationofMillion) {
		this.populationofMillion = populationofMillion;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}	
	
	
}

