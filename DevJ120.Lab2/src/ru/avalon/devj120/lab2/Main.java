package ru.avalon.devj120.lab2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
    String[] strings = {
        "баклажан",
        "бАклажан",
        "Байкал",
        "алфавит",
        "Асфальт",
        "array",
        "Board",
        "bear"                
    };
    
    System.out.println("Оригинальный массив: " + Arrays.toString(strings));
    
        try {
            String[] stringsToSorts = strings.clone();
            
            System.out.println("Прямая соритировка массива: " + Arrays.toString(StringService.sort(stringsToSorts, true)));
            System.out.println("Реверсивная соритировка массива: " + Arrays.toString(StringService.sort(stringsToSorts, false)));
        } catch (StringArrayException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Набор символов строки с индексом 1 оригинального массива: " + Arrays.toString(StringService.getCharStat(strings[1])));

}
    }
    

