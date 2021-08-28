package com.learn.patterns.design.structural.decorator.impl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice = 0;
		do {
			System.out.print("========= Food Menu ============\n");
			System.out.print("            1. Vegetarian Food.\n");
			System.out.print("            2. Non-Vegetarian Food.\n");
			System.out.print("            3. Chineese Food.\n");
			System.out.print("            4. Exit\n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: {
				VegFood vf = new VegFood();
				System.out.println(vf.prepareFood());
				System.out.println(vf.foodPrice());
			}
				break;
			case 2: {
				Food nf = new NonVegFood(new VegFood());
				System.out.println(nf.prepareFood());
				System.out.println(nf.foodPrice());
			}
				break;
			case 3: {
				Food cf = new ChineseFood(new VegFood());
				System.out.println(cf.prepareFood());
				System.out.println(cf.foodPrice());
			}
				break;
			default:
				System.out.println("Other than these no food available");
				break;
			}
			return;
		} while (choice != 4);
	}
}
