import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MySQL {

    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost:3306/selenium";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/selenium?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        HashMap<String, String> parmas = new HashMap<>();
        parmas.put("id","2");
        parmas.put("company_name","2");
        parmas.put("company_id","2");

        insert("selenium.bank", parmas);
    }

    public static void select(String tableName, HashMap<String, String> params) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("注册 JDBC 驱动");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, company_name, company_id FROM bank";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                String id = rs.getString("id");
                String company_name = rs.getString("company_name");
                String company_id = rs.getString("company_id");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 银行名称: " + company_name);
                System.out.print(", 银行统一社会信用代码: " + company_id);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }


    public static void insert(String tableName, HashMap<String, String> params) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("注册 JDBC 驱动");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            StringBuffer sql = new StringBuffer("INSERT INTO ");
            sql.append(tableName);

            StringBuffer finalSqlName = new StringBuffer(" (");
            StringBuffer finalSqlValue = new StringBuffer(" (");
            params.forEach((k, v) -> {
                finalSqlName.append(k).append(',');
                finalSqlValue.append(v).append(',');
            });
            finalSqlName.delete(finalSqlName.length() - 1, finalSqlName.length());
            finalSqlValue.delete(finalSqlValue.length() - 1, finalSqlValue.length());
            finalSqlName.append(" )");
            finalSqlValue.append(" )");
            sql.append(finalSqlName).append("VALUES").append(finalSqlValue);
            int rs = stmt.executeUpdate(sql.toString());

            // 完成后关闭
//            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("success!");
    }
}
