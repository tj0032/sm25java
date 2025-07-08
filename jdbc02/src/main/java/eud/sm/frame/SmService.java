package eud.sm.frame;

import java.util.List;

public interface SmService<V, K> {

    void register(V v) throws Exception;

    void modify(V v) throws Exception;

    void remove(V v) throws Exception;

    List<V> get() throws Exception;

    V get(K k) throws Exception;
}
