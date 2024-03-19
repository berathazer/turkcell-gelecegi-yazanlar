package com.rentacar.manager.dataaccess.abstracts;

import com.rentacar.manager.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    Optional<Brand> findByNameIgnoreCase(String name);
}
