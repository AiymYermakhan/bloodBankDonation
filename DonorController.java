package com.company.Controllers;

import com.company.Database.DatabaseConnection;
import com.company.Model.Donor;
import com.company.Repositories.DonorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DonorController implements DonorRepository {
    @Override
    public void getAllDonors(){
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM donor");

            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("ID ");
            while (rs.next()){
                int id = rs.getInt("donorid");
                String donorName = rs.getString("donorname");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                int phone = rs.getInt("phone");
                String email = rs.getString("email");
                System.out.println(id + " " + donorName + " " + age + " " + gender + " "+ address + " " + phone +" " + email );
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addNewDonor(Donor donor) {
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO donor (donorname, age, gender,address,phone,email ) VALUES (?,?,?,?,?,?) ");
            ps.setString(1,donor.getDonorName());
            ps.setInt(2,donor.getAge());
            ps.setString(3,donor.getGender());
            ps.setString(4,donor.getAddress());
            ps.setInt(5,donor.getPhone());
            ps.setString(6, donor.getEmail());
            if(ps.executeUpdate() > 0){
                System.out.println("row added");
            }else {
                System.out.println("something went wrong...");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
