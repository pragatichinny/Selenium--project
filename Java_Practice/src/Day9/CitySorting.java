package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// City class
class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (Population: " + population + ")";
    }
}

public class CitySorting {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New York", 8419000));
        cities.add(new City("Los Angeles", 3980000));
        cities.add(new City("Chicago", 2716000));
        cities.add(new City("Houston", 2328000));
        cities.add(new City("Phoenix", 1690000));

        // Original List
        System.out.println("Original List of Cities:");
        cities.forEach(System.out::println);

        // Sort by population ascending
        cities.sort(Comparator.comparingInt(c -> c.population));
        System.out.println("\nCities Sorted by Population (Ascending):");
        cities.forEach(System.out::println);

        
}

// Add getter for population for method reference
class CityWithGetter extends City {
    public CityWithGetter(String name, int population) {
        super(name, population);
    }

    public int getPopulation() {
        return this.population;
    }
}
}
