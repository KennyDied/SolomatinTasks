package com.company.tests;

import com.company.MapInfo;
import com.company.MyHashMap;

import java.util.HashMap;

public class TestMyHashMap {


        public static MapInfo addInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyHashMap<String, Object> MyTestMap = new MyHashMap<>(numOfEl);

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.put(key[i], value[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo findInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyHashMap<String, Object> MyTestMap = new MyHashMap<>(numOfEl);
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.put(key[i], value[i]);
            }

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.get(key[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo deleteInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyHashMap<String, Object> MyTestMap = new MyHashMap<>(numOfEl);
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.put(key[i], value[i]);
            }

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.remove(key[i], value[i]);

            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo deleteAddInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyHashMap<String, Object> MyTestMap = new MyHashMap<>(numOfEl);
            long startTime = System.currentTimeMillis();


            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.put(key[i], value[i]);
            }

            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo addDeleteInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyHashMap<String, Object> MyTestMap = new MyHashMap<>(numOfEl);

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.put(key[i], value[i]);
            }
            for (int i = 0; i < numOfEl; i++) {
                MyTestMap.remove(key[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }


}
