package com.greatlearning.skycraperconstruction.main;

import java.util.Scanner;

import com.greatlearning.skycraperconstruction.service.SkycraperConstructionService;

public class Driver {

	public static void main(String[] args) {
		SkycraperConstructionService skycraperService = new SkycraperConstructionService();
		System.out.println("Enter the total no of floors in the building : ");
		Scanner sc = new Scanner(System.in);
		int numberOfFloors = sc.nextInt();
		int[] listOfFloors = new int[numberOfFloors];
		for (int i = 0; i < numberOfFloors; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			int floorSize = sc.nextInt();
			listOfFloors[i] = floorSize;
		}
		skycraperService.calculateFloors(listOfFloors);
	}
}
