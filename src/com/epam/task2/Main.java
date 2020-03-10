package com.epam.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator dictionary = new Translator();
        dictionary.getWord("hello", "привет");
        dictionary.getWord("friend", "друзья");
        dictionary.getWord("mother", "мама");
        dictionary.getWord("world", "мир");
        dictionary.getWord("flower", "цветок");
        dictionary.translate("sentence");
        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();
        System.out.println("Input the phrase to translate:");
        String input = scanner.nextLine();
        System.out.println(translator.translate(input));
    }
}