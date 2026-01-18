package pracHere;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Accessing values
        System.out.println("Apple Count: " + map.get("Apple")); // Output: Apple Count: 1

        // Checking if a key exists
        System.out.println("Contains Banana: " + map.containsKey("Banana")); // Output: true

        // Checking if a value exists
        System.out.println("Contains value 3: " + map.containsValue(3)); // Output: true

        // Removing a key-value pair
        map.remove("Banana");
        System.out.println("After removing Banana: " + map); // Output: {Apple=1, Cherry=3}

        // Getting the size of the map
        System.out.println("Size of map: " + map.size()); // Output: 2

        // Iterating over keys
        System.out.println("Keys in the map:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values
        System.out.println("Values in the map:");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating over key-value pairs
        System.out.println("Key-Value pairs in the map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clearing the map
        map.clear();
        System.out.println("Map after clearing: " + map); // Output: {}
    }
}

