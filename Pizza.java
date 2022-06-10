package com.java;
import java.util.*;
public class Pizza {
	
		 String pizzabase;
		 int price;
		
		Pizza(String pizzabase, int price)
		{
			this.pizzabase = pizzabase;
			this.price = price;
		}
		void display()
		{
			System.out.println(pizzabase + " " + price);;
		}
	}


	class ChickenPizza extends Pizza
	{
		String cvariable    = "Chicken Topping";
		ChickenPizza(String pizzabase, int price)
		{
			super(pizzabase,price);
		}
		void display()
		{
			System.out.println(pizzabase + " " + price + " " + cvariable );
		}
	}

	class MuttonPizza extends ChickenPizza
	{
		String pizzabase;
		int price;
		String flavouredtopping   = "Mutton Topping";
		MuttonPizza (String pizzabase, int price)
		{
			super(pizzabase,price);
		}
		void display()
		{
			System.out.println(pizzabase + " " + price + " " + flavouredtopping );
		}
	}	