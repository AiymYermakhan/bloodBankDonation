package com.company.Repositories;

import com.company.Model.Donor;

import java.util.List;

public interface DonorRepository {
    public void getAllDonors();
    public void addNewDonor(Donor donor);

}
