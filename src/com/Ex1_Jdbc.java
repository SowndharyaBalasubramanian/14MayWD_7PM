package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Ex1_Jdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java7pm", "root","root");

            System.out.println("Connected Successfully");

            PreparedStatement ps = con.prepareStatement("Insert into employee(name, email) values(?, ? )");
            ps.setString(1, "Besant");
            ps.setString(2,"besant@gmail.com");

            ps.setString(1, "Java");
            ps.setString(2,"java@gmail.com");

            ps.executeUpdate();

            System.out.println("data inserted successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
