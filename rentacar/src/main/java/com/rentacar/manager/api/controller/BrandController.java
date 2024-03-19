package com.rentacar.manager.api.controller;

import com.rentacar.manager.business.abstracts.BrandService;
import com.rentacar.manager.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands")
public class BrandController {
    private BrandService brandService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand createBrandRequest){
        return brandService.add(createBrandRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Brand getById(@PathVariable int id){
        return this.brandService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id, @RequestBody Brand brand){
        this.brandService.update(id,brand);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }


}

