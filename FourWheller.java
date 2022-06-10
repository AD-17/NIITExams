package com.vehicle;
import java.util.Scanner;
public class FourWheller {
	
		String name;
		int cc;
		int safety;
		int price;

		FourWheller(String n, int c, int sft, int p) {
			this.name = n;
			this.cc = c;
			this.safety = sft;
			this.price = p;
		}

		void VehicleException() {
			System.out.println("Enter Available cc: ");
			Scanner s = new Scanner(System.in);
			int carcc = s.nextInt();
			if (carcc < 1000 || carcc > 4000) {
				System.out.println("It is a two wheller,not four wheller");
			}
		}

		void display() {
			System.out.println(name + " " + cc + " " + safety + " " + price);
		}

		void UnsafetyException() {
			System.out.println("Enter safety value: ");
			Scanner s = new Scanner(System.in);
			int sftvvl = s.nextInt();
			if (sftvvl != 5) {
				System.out.println("Sorry,Invalid safety features");
			}

		}
	}

	