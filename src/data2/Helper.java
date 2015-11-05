package data2;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */

import java.sql.*;

public class Helper {
    public static void checkData() throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/Olga Pavlova/IdeaProjects/EntityListenersProject/DB/DB", "SA", "");
        Statement st = conn.createStatement();

        ResultSet mrs = conn.getMetaData().getTables(null, null, null, new String[] { "TABLE" });
        while (mrs.next()) {
            String tableName = mrs.getString(3);
            System.out.println("\n\n\n\nTable Name: "+ tableName);

            ResultSet rs = st.executeQuery("select * from " + tableName);
            ResultSetMetaData metadata = rs.getMetaData();
            while (rs.next()) {
                System.out.println(" Row:");
                for (int i = 0; i < metadata.getColumnCount(); i++) {
                    System.out.println("    Column Name: "+ metadata.getColumnLabel(i + 1)+ ",  ");
                    System.out.println("    Column Type: "+ metadata.getColumnTypeName(i + 1)+ ":  ");
                    Object value = rs.getObject(i + 1);
                    System.out.println("    Column Value: "+value+"\n");
                }
            }
        }
    }
}