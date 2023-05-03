package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> s =new HashSet<>();
        int t =0;
        for(int i=0;i<sourceList.size();i++) {
            t=sourceList.get(i)*sourceList.get(i);
            if(t>=lowerBound&&t<=upperBound)s.add(t);
        }
        return s;
    }
}