package com.countries;

import java.util.ArrayList;
import java.util.TreeMap;

public class Countries {

	private TreeMap<String, ArrayList<String>> country = new TreeMap<>();

	public void listingCountry(String CountryName, ArrayList<String> state) {
		country.put(CountryName, state);
	}

	public ArrayList<String> getCountry(String CountryName) {
		if (country.containsKey(CountryName))
			return country.get(CountryName);
		return null;
	}

	public void listCountryBefore(String CountryName) {
		ArrayList<String> states = country.get(CountryName);
		for (String state : states) {
			System.out.println(CountryName + "-" + state);
		}
	}

	public void listCountryAfter(String CountryName) {
		ArrayList<String> states = country.get(CountryName);
		for (String state : states) {
			System.out.println(state + "-" + CountryName);
		}
	}

}