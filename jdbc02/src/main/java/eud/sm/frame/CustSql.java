package eud.sm.frame;

public class CustSql {
    public static String insert = "INSERT INTO cust VALUES (?, ?, ?, NOW(), NOW())";
    public static String select = "SELECT * FROM cust WHERE cust_id = ?";
    public static String selectAll = "SELECT * FROM cust";
    public static String update = "UPDATE cust SET cust_pwd = ? cust_name = ? WHERE cust_id = ?";
}
