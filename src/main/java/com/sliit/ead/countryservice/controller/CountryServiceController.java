package com.sliit.ead.countryservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.ead.countryservice.model.Country;

@RestController
@RequestMapping("/countries")
public class CountryServiceController {
	
	private static List<Country> countryList;
	
	static {
		countryList = new ArrayList<>();
		
		countryList.add(new Country("LK", "Sri Lanka", 21, "Colombo"));
		countryList.add(new Country("UK", "United Kindom", 50, "xxx"));
		countryList.add(new Country("US", "United Emirate", 21, "xxx"));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Country> getAllCountries(){
		return countryList;
	}

	@RequestMapping("/{id}")
	public Country getCountry(@PathVariable("id") String countryId) {
		Country c = null;
		
		for(Country country : countryList) {
			if(country.getCountryId().equals(countryId)) {
				c = country;
				break;
			}
		}
		return c;
	}
}
