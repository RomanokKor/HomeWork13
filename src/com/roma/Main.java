package com.roma;
import java.util.regex.Matcher;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите любое предложение. Например: “I love java 8 Я люблю java 14 core1”");

        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("[^a-zA-Z]+");

        String[] s1 = s.nextLine().split(" ");
        String result = "";

        for (String word :
                s1) {
            Matcher m = p.matcher(word);
            if (!m.find())
                result += word + " ";
        }

        result = result.trim();
        System.out.println(result);

        String[] arr = (result.split(" "));
        System.out.println(arr.length);
    }
}
