package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String delimeter = "\s";
        String[] words;
        ArrayList<Integer> counts = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> sortedMap = new HashMap<>();

        words = string.split(delimeter);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int vowel_sound = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'а' || word.charAt(j) == 'е' || word.charAt(j) == 'ё' || word.charAt(j) == 'и' || word.charAt(j) == 'о' || word.charAt(j) == 'у' || word.charAt(j) == 'ы' || word.charAt(j) == 'э' || word.charAt(j) == 'ю' || word.charAt(j) == 'я'
                        || word.charAt(j) == 'А' || word.charAt(j) == 'Е' || word.charAt(j) == 'Ё' || word.charAt(j) == 'И'  || word.charAt(j) == 'О' || word.charAt(j) == 'У'  || word.charAt(j) == 'Ы'
                        || word.charAt(j) == 'Э' || word.charAt(j) == 'Ю' || word.charAt(j) == 'Я') {
                    vowel_sound++;
                }
            }
            counts.add(i, vowel_sound);
        }
        for(int i = 0; i < words.length; i++){
            map.put(words[i], counts.get(i));
        }
        sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        for (String key : sortedMap.keySet()) {
            for(int j = 0; j < key.length(); j++){
                if (key.charAt(j) == 'а' || key.charAt(j) == 'е' || key.charAt(j) == 'ё' || key.charAt(j) == 'и' || key.charAt(j) == 'о' ||
                        key.charAt(j) == 'у' || key.charAt(j) == 'ы' || key.charAt(j) == 'э' || key.charAt(j) == 'ю' || key.charAt(j) == 'я'
                        || key.charAt(j) == 'А' || key.charAt(j) == 'Е' || key.charAt(j) == 'Ё' || key.charAt(j) == 'И' || key.charAt(j) == 'О' || key.charAt(j) == 'У' || key.charAt(j) == 'Ы' || key.charAt(j) == 'Э'
                        || key.charAt(j) == 'Ю' || key.charAt(j) == 'Я'){
                    StringBuilder new_string = new StringBuilder(key);
                    new_string.setCharAt(j, Character.toUpperCase(key.charAt(j)));
                    System.out.println(new_string);
                    break;

                }
            }
        }
    }
}