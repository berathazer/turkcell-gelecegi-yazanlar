package com.rentacar.manager.business.concretes;

import com.rentacar.manager.business.abstracts.BrandService;
import com.rentacar.manager.core.utilities.mapping.ModelMapperService;
import com.rentacar.manager.dataaccess.abstracts.BrandRepository;
import com.rentacar.manager.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.lang.module.FindException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Override
    public Brand add(Brand brand) {
        return this.brandRepository.save(brand);
    }

    @Override
    public Brand getById(int id) {
        return this.brandRepository.findById(id).orElseThrow(()-> new FindException("Brand not found"));
    }

    @Override
    public List<Brand> getAll() {
        return this.brandRepository.findAll();
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

    @Override
    public void update(int id, Brand brand) {
        Brand existedBrand = this.brandRepository.findById(id)
                .orElseThrow(() -> new FindException("Brand not found with id: " + id));

        existedBrand.setName(brand.getName());
        existedBrand.setUpdatedAt(LocalDateTime.now());
        this.brandRepository.save(existedBrand);
    }
}
