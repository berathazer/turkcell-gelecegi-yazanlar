package com.rentacar.manager.dataaccess.abstracts;

import com.rentacar.manager.entities.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepository extends JpaRepository<Transmission,Integer> {
}
