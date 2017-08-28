package com.db.multi_map;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyMultiMap<Integer, Integer> mep  = new MyMultiMap<>();

        mep.put(1, 2).put(2, Arrays.asList(2, 3));

        System.out.println(Integer.toString(1) + mep.get(1));
        System.out.println(Integer.toString(2) + mep.get(2));

        mep.remove(1);
        System.out.println(Integer.toString(1) + mep.get(1));

        MyMultiMap<Integer, Integer> mep2  = new MyMultiMap<>();

        mep2.put(1, 23).put(2, 234);

        mep.merge(mep2);
        System.out.println(Integer.toString(1) + mep.get(1));
        System.out.println(Integer.toString(2) + mep.get(2));

    }
}
