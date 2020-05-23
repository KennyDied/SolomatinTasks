package com.company.tests;

import com.company.MapInfo;
import com.company.myTreeMap.MyTreeMap;

import java.util.TreeMap;

public class TestMyTreeMap {


        public static MapInfo addInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyTreeMap<String, Object> javaTestMap = new MyTreeMap<>();

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.put(key[i], value[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo findInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyTreeMap<String, Object> javaTestMap = new MyTreeMap<>();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.put(key[i], value[i]);
            }

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {

                javaTestMap.get(key[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo deleteInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyTreeMap<String, Object> javaTestMap = new MyTreeMap<>();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.put(key[i], value[i]);
            }

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.remove(key[i]);
            }
            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo deleteAddInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyTreeMap<String, Object> javaTestMap = new MyTreeMap<>();

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.remove(key[i]);
            }
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.put(key[i], value[i]);
            }


            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }

        public static MapInfo addDeleteInfo(String[] key, Object[] value){
            int numOfEl = key.length;
            MyTreeMap<String, Object> javaTestMap = new MyTreeMap<>();


            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.put(key[i], value[i]);
            }
            for (int i = 0; i < numOfEl; i++) {
                javaTestMap.remove(key[i]);
            }

            long finishTime = System.currentTimeMillis();

            return new MapInfo(numOfEl, finishTime - startTime);
        }


}
