package com.db.multi_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMultiMap <K, V> implements MultiMap<K, V> {
    private Map<K, List<V>> hashMap;

    public MyMultiMap(){
        hashMap = new HashMap<>();
    }

    @Override
    public int size(){
        return hashMap.size();
    }

    @Override
    public List<V> get(K key){
        return hashMap.get(key);
    }

    @Override
    public MyMultiMap remove(int key){
        hashMap.remove(key);
        return this;
    }

    @Override
    public MyMultiMap put(K key, V val){
        List<V> newList = new ArrayList<>();
        newList.add(val);
        this.put(key, newList);
        return this;
    }

    @Override
    public MyMultiMap put(K key, List<V> val){
        List<V> newList;

        if (hashMap.containsKey(key)){
            newList = this.hashMap.get(key);
        } else {
            newList = new ArrayList<>();
        }

        newList.addAll(val);
        hashMap.put(key, newList);

        return this;
    }

    @Override
    public MyMultiMap merge(MyMultiMap<K, V> m){
        for(K key : m.hashMap.keySet()){
            if (this.hashMap.containsKey(key)){
                List<V> newList = this.hashMap.get(key);
                List<V> newList2 = m.hashMap.get(key);
                newList.addAll(newList2);
            }
            else{
                this.put(key, m.hashMap.get(key));
            }
        }

        return this;
    }


}
