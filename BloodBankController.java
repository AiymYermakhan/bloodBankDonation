package com.company.Controllers;

import com.company.Database.DatabaseConnection;
import com.company.Repositories.BloodBankRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BloodBankController implements BloodBankRepository {
    @Override
    public Integer getOrder(String bloodBankName) {
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT bloodBankName FROM registerBloods WHERE bloodBankName = ?");
            ps.setString(1, bloodBankName);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()){
                count++;
            }
            return count;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void getName() {
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT bloodBankName FROM registerBloods");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String name = rs.getString("bloodBankName");
                System.out.println("Blood Bank Name: " + name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
