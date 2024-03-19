package com.rentacar.manager.business.concretes;

import com.rentacar.manager.business.abstracts.ModelService;
import com.rentacar.manager.dataaccess.abstracts.ModelRepository;
import com.rentacar.manager.entities.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;

    @Override
    public Model add(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model getById(int id) {
        return modelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Model not found with id: " + id));
    }

    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    @Override
    public void delete(int id) {
        modelRepository.deleteById(id);
    }

    @Override
    public void update(int id, Model model) {
        Model existedModel = modelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Model not found with id: " + id));

        existedModel.setName(model.getName());
        existedModel.setUpdatedAt(LocalDateTime.now());

        modelRepository.save(existedModel);
    }
}
