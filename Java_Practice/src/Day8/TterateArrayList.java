package Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class TterateArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        // Create an Iterator
        Iterator<String> it = cities.iterator();

        // Use Iterator to display each city
        System.out.println("Cities in the list:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

