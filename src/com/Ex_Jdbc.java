package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex_Jdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java7pm";
        String username = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("Select * from employee");
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID : " + id + " Name : " + name + " " + "Email : " + email );

            }
            System.out.println("conected successfully");
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
