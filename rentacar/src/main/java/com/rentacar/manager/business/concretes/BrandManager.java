package com.rentacar.manager.business.concretes;

import com.rentacar.manager.business.abstracts.BrandService;
import com.rentacar.manager.business.Dtos.Requests.CreateBrandRequest;
import com.rentacar.manager.business.Dtos.Responses.CreateBrandResponse;
import com.rentacar.manager.business.rules.BrandBusinessRules;
import com.rentacar.manager.core.utilities.mapping.ModelMapperService;
import com.rentacar.manager.dataaccess.abstracts.BrandRepository;
import com.rentacar.manager.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public  CreateBrandResponse add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        brand.setCreatedAt(LocalDateTime.now());

        Brand createdBrand =  brandRepository.save(brand);
        CreateBrandResponse createdBrandResponse =
                this.modelMapperService.forResponse().map(createdBrand,CreateBrandResponse.class);

        return createdBrandResponse;
    }

}
