package com.company;

import com.company.Controllers.BloodBankController;
import com.company.Controllers.DonorController;
import com.company.Controllers.ReceptionistController;
import com.company.Model.Donor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("Welcome to Blood Donation Database");
            System.out.println("Log in as:");
            System.out.println("1. Employee");
            System.out.println("2. Client");
            System.out.println("0. Exit");

            System.out.print("Enter option (1-2): ");
            int option = sc.nextInt();
            while (true){
                if (option == 1){
                    ReceptionistController receptionistController = new ReceptionistController();
                    receptionistController.getReceptionist();
                    System.out.println("Please enter your name: ");
                    String name = sc.next();
                    System.out.println("Please enter your password: ");
                    String password = sc.next();
                    if(receptionistController.login(name, password)) {
                        System.out.println("You entered to the system!");
                        System.out.println("1. Get Order: ");
                        System.out.println("2. Get All Donors");
                        int choice = sc.nextInt();
                        if (choice == 1) {
                            BloodBankController bloodBankController = new BloodBankController();
                            System.out.println("These is the names of Blood Banks, please write one below!");
                            bloodBankController.getName();
                            String bloodBank = sc.next();
                            int orders = bloodBankController.getOrder(bloodBank);
                            System.out.println("Blood bank with name " + bloodBank + "has " + orders + "orders");
                        } else if (choice == 2) {
                            DonorController donorController = new DonorController();
                            System.out.println("These is the names of Donors: ");
                            donorController.getAllDonors();
                        } else {
                            System.exit(0);
                        }
                    }else {
                        System.out.println("Wrong password or name");
                    }
                }else if(option == 2){
                    System.out.println("Welcome to the Donor registration page: ");
                    System.out.println("Please, enter you name: ");
                    String name = sc.next();
                    System.out.println("Please, enter you age: ");
                    int age = sc.nextInt();
                    System.out.println("Please, enter you gender: ");
                    String gender = sc.next();
                    System.out.println("Please, enter you address: ");
                    String address = sc.next();
                    System.out.println("Please, enter you phone: ");
                    int phone = sc.nextInt();
                    System.out.println("Please, enter you email: ");
                    String email = sc.next();
                    System.out.println("Please, enter you donor: ");
                    Donor donor = new Donor(name, age, gender, address, phone, email);
                    DonorController donorController = new DonorController();
                    donorController.addNewDonor(donor);
                    System.out.println("Donor has been added!");
                    break;
//                    HospitalController hospitalController = new HospitalController();
//                    hospitalController.getName();
//                    System.out.println("please enter name of h");
//                    String hospitalName = sc.next();
//                    System.out.println(hospitalController.getAddress(hospitalName));

                }
            }
        }
    }

    }
