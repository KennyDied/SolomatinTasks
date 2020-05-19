package com.company;

public class ExperimentInfo {
    private MapInfo[] myMapResult;
    private MapInfo[] javaMapResult;

    public ExperimentInfo(int size) {
        myMapResult = new MapInfo[size];
        javaMapResult = new MapInfo[size];
    }
}