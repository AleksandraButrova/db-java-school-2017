package com.db.multi_map;

import java.util.List;

public interface MultiMap<K, V> {
    int size();

    List<V> get(K key);

    MyMultiMap remove(int key);

    MyMultiMap put(K key, V val);

    MyMultiMap put(K key, List<V> val);

    MyMultiMap merge(MyMultiMap<K, V> m);
}
