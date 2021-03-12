package com.company.Repositories;

import com.company.Model.Receptionist;

public interface ReceptionistRepository {
    public void getReceptionist();
    public boolean login(String username, String password);
}
