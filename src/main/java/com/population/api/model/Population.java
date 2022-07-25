package com.population.api.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Population {
	public String city;
	public String population;
	public String country;






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());



		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Population other = (Population) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;

		return true;
	}

}