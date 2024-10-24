package com.campusdual.classroom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> hashMap = new HashMap<>();


        hashMap.put("person", new Person("John", "Smith"));
        hashMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        hashMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        hashMap.put("doctor", new Doctor("Gregory",  "House", "Nefrología e infectología"));

        return hashMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

        return map.put(key, value);
    }


    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            String element = customList.get(i);
            System.out.println("El índice: " + i + ", tiene el valor: " + element);
        }
    }
    public static void printMapValues(Map<String, Person> map) {

        for (Map.Entry<String, Person> entry : map.entrySet()) {
            String key = entry.getKey();
            Person value = entry.getValue();

            System.out.println( entry.getValue().getDetails());
        }
    }

    public static void main(String[] args) {
        Map<String, Person> myMap = createHashMap();


        System.out.println("Valores del mapa");
        printMapValues(myMap);

        Person newPolice = new PoliceOfficer("Charles", "Boyle", "B-99");
        Person addedValue = addMapValue(myMap, "police", newPolice);

        System.out.println("Valor añadido: " + addedValue);


        System.out.println("Valores del mapa después de añadir:");
        printMapValues(myMap);
    }
    
}
