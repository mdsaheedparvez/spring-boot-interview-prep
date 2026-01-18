package geeksforGeeksStringProbelms;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create two sample maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 1);
        map2.put("B", 2);
        map2.put("C", 3);

        // Check if the keys and values of map1 are equal to map2
        boolean isEqual = mapsEqual(map1, map2);
        System.out.println("Are the maps equal? " + isEqual);
    }

    public static <K, V> boolean mapsEqual(Map<K, V> map1, Map<K, V> map2) {
        // Check if the sizes of the maps are equal
        if (map1.size() != map2.size()) {
            return false;
        }

        // Iterate over map1 and verify if the corresponding key-value pairs exist in map2
        for (Map.Entry<K, V> entry : map1.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            if (!map2.containsKey(key) || !map2.get(key).equals(value)) {
                return false;
            }
        }

        // If all key-value pairs are equal, return true
        return true;
    }
}
