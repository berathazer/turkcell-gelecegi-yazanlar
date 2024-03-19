package com.rentacar.manager.api.controller;

import com.rentacar.manager.business.abstracts.ModelService;
import com.rentacar.manager.entities.Model;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/models")
public class ModelController {
    private final ModelService modelService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Model add(@RequestBody Model createModelRequest){
        return modelService.add(createModelRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Model> getAll(){
        return modelService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Model getById(@PathVariable int id){
        return modelService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id, @RequestBody Model model){
        modelService.update(id, model);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        modelService.delete(id);
    }
}
