package com.rentacar.manager.api.controller;

import com.rentacar.manager.business.abstracts.FuelService;
import com.rentacar.manager.entities.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fuels")
public class FuelController {
    private final FuelService fuelService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel createFuelRequest){
        return fuelService.add(createFuelRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Fuel> getAll(){
        return fuelService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Fuel getById(@PathVariable int id){
        return fuelService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id, @RequestBody Fuel fuel){
        fuelService.update(id, fuel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        fuelService.delete(id);
    }
}
