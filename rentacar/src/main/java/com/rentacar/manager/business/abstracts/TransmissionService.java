package com.rentacar.manager.business.abstracts;

import com.rentacar.manager.entities.Model;
import com.rentacar.manager.entities.Transmission;

import java.util.List;

public interface TransmissionService {
    Transmission add(Transmission transmission);

    Transmission getById(int id);

    List<Transmission> getAll();

    void delete(int id);

    void update(int id,Transmission transmission);
}
