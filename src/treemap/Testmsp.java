package treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Testmsp {
    public static void main(String[] args) {
        Map <String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smitch", 22);
        hashMap.put("Joe", 21);
        hashMap.put("Lilmex", 23);
        hashMap.put("Levin Wish", 18);
        hashMap.put("Benz", 25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smicth", 22);
        linkedHashMap.put("Joe", 21);
        linkedHashMap.put("Lilmex", 23);
        linkedHashMap.put("Benz", 25);
        linkedHashMap.put("levin Wish", 18);
        System.out.println("\nThe age for " + "Benz is " + linkedHashMap.get("Benz"));
    }
}
