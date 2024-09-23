package com.deloitte.lab06.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgeChecker {

	public static List<String> votersList(Map<String, Integer> people) {

		List<String> eligibleVoters = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : people.entrySet()) {
			String id = entry.getKey();
			int age = entry.getValue();

			if (age > 18) {
				eligibleVoters.add(id);
			}
		}

		return eligibleVoters;
	}

	public static void main(String[] args) {

		Map<String, Integer> people = new HashMap<>();
		people.put("P01", 20);
		people.put("P02", 17);
		people.put("P03", 19);
		people.put("P04", 16);
		people.put("P05", 22);

		List<String> eligibleVoterIDs = votersList(people);

		System.out.println("Eligible voter IDs: " + eligibleVoterIDs);
	}

}
