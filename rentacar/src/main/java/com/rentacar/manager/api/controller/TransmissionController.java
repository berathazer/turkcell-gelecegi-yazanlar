package com.rentacar.manager.api.controller;

import com.rentacar.manager.business.abstracts.TransmissionService;
import com.rentacar.manager.entities.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/transmissions")
public class TransmissionController {
    private final TransmissionService transmissionService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Transmission add(@RequestBody Transmission createTransmissionRequest){
        return transmissionService.add(createTransmissionRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Transmission> getAll(){
        return transmissionService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Transmission getById(@PathVariable int id){
        return transmissionService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id, @RequestBody Transmission transmission){
        transmissionService.update(id, transmission);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        transmissionService.delete(id);
    }
}
