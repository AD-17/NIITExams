package com.countries;

import java.util.ArrayList;
import java.util.Scanner;



public class CountryMain {

	public static void main(String[] args) {

		Countries countries = new Countries();

		ArrayList<String> indianStates = new ArrayList<>();
		indianStates.add("Maharashtra");
		indianStates.add("Kerla");
		indianStates.add("Kashmir");

		ArrayList<String> usStates = new ArrayList<>();
		usStates.add("Alaska");
		usStates.add("Hawaii");
		usStates.add("New York");

		countries.listingCountry("India", indianStates);
		countries.listingCountry("US", usStates);

		Scanner scn = new Scanner(System.in);
		System.out.println("Choose option from given below");
		System.out.println("press 1 for India");
		System.out.println("press 2 for US");
		int option = scn.nextInt();

		if (option == 1) {
			System.out.println("-------Calling getCountry Method with Valid Country-------");
			  System.out.println(countries.getCountry("India"));
			  System.out.println("\n-------Calling listCountryBefore Method with Country India-------" ); countries.listCountryBefore("India");
			  System.out.println("\n-------Calling listCountryAfter Method with Country India-------");
				  countries.listCountryAfter("India");

		} else if (option == 2) {

			System.out.println("-------Calling getCountry Method with Valid Country-------");
			  System.out.println(countries.getCountry("US"));
			  System.out.println("\n-------Calling listCountryBefore Method with Country US-------" ); countries.listCountryBefore("US");
			  System.out.println("\n-------Calling listCountryAfter Method with Country US-------");
				  countries.listCountryAfter("US");


	}
		else {
			System.out.println("Country Doesnot Exist");
		}
	}}

