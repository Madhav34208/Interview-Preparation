package com.luv4code.functionals;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringManipulationClient {
    public static void main(String[] args) {
//        countDuplicateChars("Madhaaavvvddd");
//        countOccurrenceOfEachWord("My Name is Madhav Madhav Madhav My name");
//        findFirstUniqueChar("madhavmd");
//        reverseString("Madhav");
//        checkAnagram("madam","damma");
//        removeVowels("Madhav");
//        longestWord("What are you doing?");
//        countVowelsAndConstants("Madhva Ponnana 123");
        capitalizeFirstLetter("madhav ponnana akkivalasa");
    }

    //capitalize first character in each word
    public static void capitalizeFirstLetter(String input) {
        String capitalizeString = Stream.of(input.split("\\s"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(capitalizeString);
    }

    //count vowels and constants in a string
    public static void countVowelsAndConstants(String input) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        long countVowels = input.chars().mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .count();

        long countConstants = input.chars().mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c) && !vowels.contains(c))
                .count();
        System.out.println("Vowels: " + countVowels);
        System.out.println("Constants: " + countConstants);
    }

    //find longest word in a string
    private static void longestWord(String input) {
        String longestWord = Stream.of(input.split("\\s"))
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(longestWord);
    }

    //removing vowels from string
    private static void removeVowels(String input) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String result = input.chars().mapToObj(c -> (char) c)
                .filter(c -> !set.contains(c))
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(result);

    }

    //check the given two strings are anagram or not
    private static void checkAnagram(String input1, String input2) {
        String sortedInput1 = Stream.of(input1.toLowerCase().split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining(""));
        String sortedInput2 = Stream.of(input2.toLowerCase().split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining(""));
        if (sortedInput1.equals(sortedInput2))
            System.out.println("Anagrams");
        else
            System.out.println("Not");
    }

    //reverse a string using streams
    public static void reverseString(String input) {
        String reverse = Stream.of(input.split(""))
                .reduce("", (reversed, character) -> character + reversed);
        System.out.println(reverse);

        String collect = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                })).map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(collect);
    }

    //find the first non-repeated character in a word
    public static void findFirstUniqueChar(String input) {
        Character character = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(character);
    }

    //count occurrence of each word in string
    public static void countOccurrenceOfEachWord(String input) {
        Stream.of(input.toLowerCase().split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()))
                .entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    //count duplicate characters in a string
    public static void countDuplicateChars(String input) {
        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
