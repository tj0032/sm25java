package org.example;

import java.sql.*;

public class SelectAllCust {
    public static void mian(String args[]){
// 1.MySQL Driver Loading. . .
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found");
        }
        // 2. Connection . . .
        String url = "jdbc:mysql:// 10.20.37.186/shopdb";
        String user = "smuser";
        String password = "111111";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();  //뭐가 틀렸는지 알려줌
        }


        // 3. SQL 문장 생성
        String selectAllSql = "SELECT * FROM cust";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(selectAllSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String cust_id = rs.getString("cust_id");
                String cust_pwd = rs.getString("cust_pwd");
                String cust_name = rs.getString("cust_name");
                Date cust_regdate = rs.getDate("cust_regdate");
                Date cust_update =  rs.getDate("cust_update");
                System.out.printf("%s %s %s %s \n", cust_id, cust_pwd, cust_name, cust_regdate.toString());
            }
        } catch (SQLException e) {
            System.out.println("Failed to select all cust");
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
        if (pstmt != null) {
            try{
                pstmt.close();
            }catch (SQLException e){}
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {}
        }
    }
}

