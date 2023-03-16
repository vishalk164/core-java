package com.World;

import java.util.Iterator;
import java.util.List;

public class ItrationOfWorld {

	public static void main(String[] args) {

		World world = new World();

		List<List<List<String>>> worldList = World.addcountry();

		System.out.println("--------------  All Cities  --------------\n");
		System.out.println("All Cities : " + worldList);

		System.out.println("\n---------------   Itrator  ------------------\n");

		Iterator<List<List<String>>> itrCountry = worldList.iterator();

		while (itrCountry.hasNext()) {
			List<List<String>> country = itrCountry.next();
			// System.out.println(country);

			Iterator<List<String>> itrStates = country.iterator();
			while (itrStates.hasNext()) {
				List<String> states = itrStates.next();
				System.out.println(states);

				Iterator<String> itrCities = states.iterator();
				while (itrCities.hasNext()) {
					String cities = itrCities.next();
					System.out.println(cities);

				}
			}
		}

		System.out.println("\n--------------------------------------------\n");
		System.out.println("------------  Using For Each Loop  ---------\n");

		for (List<List<String>> countries : worldList) {
//		System.out.println("-----  All cities in the world  -----\n");
//		System.out.println(countries);

			for (List<String> states : countries) {
//			System.out.println("-----  All States  -----\n");
//			System.out.println(states);
				for (String cities : states) {
//				System.out.println("-----   All Cities   -----\n");
					System.out.println(cities);
				}
			}

		}
	}

}
