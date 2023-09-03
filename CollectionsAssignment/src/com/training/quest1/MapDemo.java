package com.training.quest1;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {

		Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>() {
			{
				put("Haryana", Arrays.asList("Gurgaon", "Faridabad", "Nuh"));
				put("Punjab", Arrays.asList("Mohali", "Ludhiana", "Malerkotla"));
				put("Uttar Pradesh", Arrays.asList("Lucknow", "Sultanpur", "Agra"));
			}
		};

		for (Map.Entry<String, List<String>> value : stateCitiesMap.entrySet()) {
			String state = value.getKey();
			List<String> cities = value.getValue();

			System.out.println("State: " + state);
			System.out.println("Cities: " + cities);
			System.out.println();
		}
	}

}
