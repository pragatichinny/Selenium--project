package day3_Assignment;
import java.util.HashMap;
import java.util.Map;
public class Element_frequency_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 30, 10, 20, 10, 20, 30, 10, 40, 50, 40};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        System.out.println("Frequency of each element in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }

	}

}
