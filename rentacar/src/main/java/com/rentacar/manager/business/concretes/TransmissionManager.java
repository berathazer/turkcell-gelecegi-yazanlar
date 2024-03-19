package com.rentacar.manager.business.concretes;

import com.rentacar.manager.business.abstracts.TransmissionService;
import com.rentacar.manager.dataaccess.abstracts.TransmissionRepository;
import com.rentacar.manager.entities.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class TransmissionManager implements TransmissionService {

    private final TransmissionRepository transmissionRepository;

    @Override
    public Transmission add(Transmission transmission) {
        return transmissionRepository.save(transmission);
    }

    @Override
    public Transmission getById(int id) {
        return transmissionRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Transmission not found with id: " + id));
    }

    @Override
    public List<Transmission> getAll() {
        return transmissionRepository.findAll();
    }

    @Override
    public void delete(int id) {
        transmissionRepository.deleteById(id);
    }

    @Override
    public void update(int id, Transmission transmission) {
        Transmission existedTransmission = transmissionRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Transmission not found with id: " + id));

        existedTransmission.setName(transmission.getName());
        existedTransmission.setUpdatedAt(LocalDateTime.now());

        transmissionRepository.save(existedTransmission);
    }
}
