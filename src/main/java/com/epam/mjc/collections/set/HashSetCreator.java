package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hs = new HashSet<>();
        int t=0;
        for(int i =0;i<sourceList.size();i++){
            hs.add(sourceList.get(i));
            t = sourceList.get(i);
            if(t%2==1)hs.add(t*2);
            while (t%2 != 1){
                hs.add(t);
                t = t/2;
            }
            hs.add(t);
        }
        return hs;
    }
}
