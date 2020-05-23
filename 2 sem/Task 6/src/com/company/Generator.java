package com.company;

import java.util.Random;

public class Generator {
    public static String[] makeKey(int lenOfKey, int sizeOfArray){
        String[] key = new String[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            key[i] = randomString(lenOfKey);
        }
        return key;
    }
    public static Integer[] makeValueInt(int sizeOfArray){
        Integer[] value = new Integer[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            value[i] = randomInt(10000);
        }
        return value;
    }

    public static Double[] makeValueDouble(int sizeOfArray){
        Double[] value = new Double[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            value[i] = randomDouble();
        }
        return value;
    }

    public static String randomString(int n) {
        // нижний предел для строчных букв
        int lowerLimit = 97;
        // нижний предел для строчных букв
        int upperLimit = 122;
        Random random = new Random();
        StringBuffer r = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            // принимаем случайное значение от 97 до 122
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            // добавить символ в конце bs
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }

    public static int randomInt(int max) {
        Random r = new Random();
        return r.nextInt((max - 0) + 1) + 0;
    }

    public static Double randomDouble() {
        return  Math.random() * 10000 - 0;
    }
}
