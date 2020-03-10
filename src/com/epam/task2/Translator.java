package com.epam.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Translator {
    private HashMap<String, String> dictMap = new HashMap<>();

    public String translate(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] splittedStrings = sentence.trim().split(" ");

        List<String> list = new ArrayList<>();
        for (String s : splittedStrings) {
            String translated = dictMap.getOrDefault( splittedStrings, s);
            result.append(translated);
        }
        return result.toString();
    }

    public String getWord(String word, String translated) {
        return dictMap.put(word, translated);
    }
}
