package com.rentacar.manager.business.abstracts;

import com.rentacar.manager.entities.Fuel;
import com.rentacar.manager.entities.Model;

import java.util.List;

public interface ModelService {
    Model add(Model model);

    Model getById(int id);

    List<Model> getAll();

    void delete(int id);

    void update(int id,Model model);
}
