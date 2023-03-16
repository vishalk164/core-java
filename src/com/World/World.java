package com.World;

import java.util.ArrayList;
import java.util.List;

public class World {
	
	public static List<List<List<String>>> addcountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Mumbai");
		maharashtra.add("Nagar");
		maharashtra.add("Pune");

		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Surat");
		gujrat.add("Vapi");
		gujrat.add("GandhiNagar");

		List<List<String>> India = new ArrayList<List<String>>();
		India.add(maharashtra);
		India.add(gujrat);
		
		List<String> California = new ArrayList<String>();
		California.add("Los Angeles");
		California.add("San Diego");
		California.add("San Francisco");
		
		
		List<String> Flowrida = new ArrayList<String>();
		Flowrida.add("Orlando");
		Flowrida.add("Miami");
		Flowrida.add("Tampa");
		
		List<List<String>> Usa = new ArrayList<List<String>>();
		Usa.add(Flowrida);
		Usa.add(California);
		
		List<List<List<String>>> Country = new ArrayList<List<List<String>>>();
		Country.add(India);
		Country.add(Usa);
		

		return Country;
	}

}
