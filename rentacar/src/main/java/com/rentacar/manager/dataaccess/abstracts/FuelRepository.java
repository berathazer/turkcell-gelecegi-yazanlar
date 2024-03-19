package com.rentacar.manager.dataaccess.abstracts;

import com.rentacar.manager.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelRepository extends JpaRepository<Fuel,Integer> {
}
