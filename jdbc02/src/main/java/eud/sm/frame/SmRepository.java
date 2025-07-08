package eud.sm.frame;

import java.sql.Connection;
import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능 정의
    // INSERT(C), SELECT(R), UPDATE(U), DELETE(D)
    void insert(V v, Connection conn) throws Exception;
    void update(V v, Connection conn) throws Exception;
    void delete(K k, Connection conn) throws Exception;
    List<V> selectALL(Connection conn) throws Exception;
    V get(K k, Connection conn) throws Exception;
}
