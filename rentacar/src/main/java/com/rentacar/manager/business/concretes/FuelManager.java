package com.rentacar.manager.business.concretes;

import com.rentacar.manager.business.abstracts.FuelService;
import com.rentacar.manager.dataaccess.abstracts.FuelRepository;
import com.rentacar.manager.entities.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class FuelManager implements FuelService {

    private final FuelRepository fuelRepository;

    @Override
    public Fuel add(Fuel fuel) {
        return fuelRepository.save(fuel);
    }

    @Override
    public Fuel getById(int id) {
        return fuelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Fuel not found with id: " + id));
    }

    @Override
    public List<Fuel> getAll() {
        return fuelRepository.findAll();
    }

    @Override
    public void delete(int id) {
        fuelRepository.deleteById(id);
    }

    @Override
    public void update(int id, Fuel fuel) {
        Fuel existedFuel = fuelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Fuel not found with id: " + id));

        existedFuel.setName(fuel.getName());
        existedFuel.setUpdatedAt(LocalDateTime.now());

        fuelRepository.save(existedFuel);
    }
}
