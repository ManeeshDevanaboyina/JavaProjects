/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.sql.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class SqlTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
//here sonoo is database name, root is username and password
           try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/books?characterEncoding=utf8", "root","")) {
                //here sonoo is database name, root is username and password
               
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from tblbooks where Price<50");
                try (FileWriter writer = new FileWriter("newfile.txt")) {
                    while (rs.next()) {
                        System.out.println(rs.getLong(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4));
                        writer.write(rs.getLong(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4)+"\n");
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}



