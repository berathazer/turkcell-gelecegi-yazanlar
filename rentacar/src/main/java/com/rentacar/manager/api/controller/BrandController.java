package com.rentacar.manager.api.controller;

import com.rentacar.manager.business.abstracts.BrandService;
import com.rentacar.manager.business.Dtos.Requests.CreateBrandRequest;
import com.rentacar.manager.business.Dtos.Responses.CreateBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands")
public class BrandController {
    private BrandService brandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBrandResponse add(@RequestBody CreateBrandRequest createBrandRequest){
        return brandService.add(createBrandRequest);
    }
}

