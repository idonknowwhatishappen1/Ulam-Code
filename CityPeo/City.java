package CityPeo;

import java.util.HashSet;
import java.util.Set;
public class City {
	private String cityName; 
	private Set<Inhabitant> inhabitants;
	public int unmarriedCount;
	
	
	public City(String cityName) {
		this.cityName = cityName; 
		this.inhabitants = new HashSet<>();	
		
	}
	public Inhabitant searchInhabitant(String name) {
		for(Inhabitant inhabitant : inhabitants) {
			if(inhabitant.getName().equals(name)) {
				return inhabitant; 
			}
		} 
		return null;
	}
	public void addInhabitant(String name, String dateOfBirth, String martialStatus) {
		Inhabitant newInhabitant = new Inhabitant(name, dateOfBirth, martialStatus);
		inhabitants.add(newInhabitant);
	}
	
	public Set<Inhabitant> getAllInhabitants(){
		return inhabitants; 
	}
	public String getCityName() {
		return cityName;
	}
	
}
