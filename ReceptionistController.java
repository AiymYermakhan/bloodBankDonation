package com.company.Controllers;

import com.company.Database.DatabaseConnection;
import com.company.Repositories.ReceptionistRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReceptionistController implements ReceptionistRepository {
    @Override
    public void getReceptionist() {
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT employeename FROM receptionist");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String name = rs.getString("employeename");
                System.out.println("Employee Name: " + name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean login(String username, String password) {
        boolean flag = false;
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT employeename, password FROM receptionist");
            while (resultSet.next()){
                if (username.equals(resultSet.getString("employeename"))){
                    if(password.equals(resultSet.getString("password"))){
                        flag = true;
                    }else {
                        flag = false;
                        System.out.println("Wrong username or password");
                    }
                }else {
                    flag = false;
                    System.out.println("No such user in the database");
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return flag;
    }
}
