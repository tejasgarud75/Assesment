package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static int countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {

                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap.size();
    }
}
