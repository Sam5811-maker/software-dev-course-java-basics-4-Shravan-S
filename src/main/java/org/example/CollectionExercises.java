package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        String[] fruits = new String[size];
        // Use a loop to set every element to "apple"
        for (int i = 0; i <size; i++) {
            fruits[i] = "apple";
        }
        // Replace the line below with your implementation
        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] topThree =new String[3];
        for (int i = 0; i < 3; i++) {
            topThree[i] = fruits[i];
        }
        return topThree;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        ArrayList<String> fruitList = new ArrayList<>();
        // "apple", "banana", "cherry", "date", "elderberry"
        fruitList.add ("apple");
        fruitList.add ("banana");
        fruitList.add ("cherry");
        fruitList.add ("date");
        fruitList.add ("elderberry");
        // Replace the line below with your implementation
        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        ArrayList<String> threeFruitList = new ArrayList<>();
        threeFruitList.add(fruit1);
        threeFruitList.add(fruit2);
        threeFruitList.add(fruit3);
        // Replace the line below with your implementation
        return threeFruitList;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        HashMap<String, String> fruitMap = new HashMap<>();
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");
        // Replace the line below with your implementation
        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        String fruitColor = fruitMap.get("apple");
        // Replace the line below with your implementation
        return fruitColor;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        HashSet<String> fruitSet = new HashSet<>();
        // Replace the line below with your implementation
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        return fruitSet;
    }
}
