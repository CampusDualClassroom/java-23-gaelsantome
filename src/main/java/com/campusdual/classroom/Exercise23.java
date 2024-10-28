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

         map.put(key, value);
        return map.get(key);
    }


    public static void printMapValues(Map<String, Person> map) {

        for (Person person : map.values()) {
            System.out.println(person.getDetails());
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
