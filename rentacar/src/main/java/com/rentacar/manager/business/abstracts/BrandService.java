package com.rentacar.manager.business.abstracts;

import com.rentacar.manager.entities.Brand;

import java.util.List;

public interface BrandService {
    Brand add(Brand brand);

    Brand getById(int id);

    List<Brand> getAll();

    void delete(int id);

    void update(int id,Brand brand);

}
