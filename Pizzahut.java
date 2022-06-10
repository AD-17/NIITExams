package com.java;

import java.util.Scanner;

public class Pizzahut {


		public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);
			System.out.println("Choose option from given below");
			System.out.println("press 1 for Simple pizza");
			System.out.println("press 2 for Chicken pizza");
			System.out.println("press 3 for Mutton pizza");
			int option = scn.nextInt();

			if (option == 1) {
				Pizza pz = new Pizza("fdd", 230);
				pz.display();
			} else if (option == 2) {

				Pizza pz1 = new ChickenPizza("fdd", 240);
				pz1.display();

			} else if (option == 3) {
				ChickenPizza pz2 = new MuttonPizza("fdd", 250);
				pz2.display();
			} else {
				System.out.println("Wrong input");
			}

		}
}
