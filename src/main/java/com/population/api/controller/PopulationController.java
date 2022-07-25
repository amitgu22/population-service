package com.population.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.population.api.model.Population;

@RestController
public class PopulationController {

	private List<Population> populations = createList();

	@RequestMapping(value = "/countryPopulation", method = RequestMethod.GET, produces = "application/json")
	public List<Population> firstPage() {
		return populations;
	}



	private static List<Population> createList() {
		List<Population> populationList = new ArrayList<>();
		Population population = Population.builder().population("3465000")
						.city("BERLIN").build();

		Population population1 = Population.builder().population("1765000")
						.city("WARSAW").build();

		populationList.add(population);
		populationList.add(population1);


		return populationList;
	}
}