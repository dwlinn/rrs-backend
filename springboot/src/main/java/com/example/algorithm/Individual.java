package com.example.algorithm;

import java.util.ArrayList;
import java.util.List;

class Individual {
    List<Integer> genes;
    double fitness;
    List<Integer> startTimes;
    List<Integer> endTimes;

    public Individual(List<Integer> genes) {
        this.genes = genes;
        this.fitness = 0;
        this.startTimes = new ArrayList<>();
        this.endTimes = new ArrayList<>();
    }
}