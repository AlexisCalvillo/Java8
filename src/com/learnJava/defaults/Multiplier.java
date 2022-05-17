package com.learnJava.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> inegerList);
    default int size(List<Integer> integers){
        return integers.size();
    }

    static boolean isEmpty(List<Integer> list){
        return list!=null && list.size()>=0;
    }
}
