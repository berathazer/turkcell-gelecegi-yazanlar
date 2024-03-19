package com.rentacar.manager.business.abstracts;

import com.rentacar.manager.entities.Brand;
import com.rentacar.manager.entities.Fuel;

import java.util.List;

public interface FuelService {
    Fuel add(Fuel fuel);

    Fuel getById(int id);

    List<Fuel> getAll();

    void delete(int id);

    void update(int id,Fuel fuel);
}
