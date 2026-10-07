package org.example.aula11;

import java.util.HashMap;
import java.util.Map;

public class AulaHashMap {
    static void main(String[] args) {

        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "ane@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posição 2:", "qualquer coisa");

        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("Paloma"));
        System.out.println(emails.get("posição 2:"));
        System.out.println(emails.getOrDefault("olá", "posição inválida"));

        System.out.println(emails.keySet());
        System.out.println(emails.values());
        System.out.println();
    }
}
