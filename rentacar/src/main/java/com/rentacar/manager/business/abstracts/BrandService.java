package com.rentacar.manager.business.abstracts;

import com.rentacar.manager.business.Dtos.Requests.CreateBrandRequest;
import com.rentacar.manager.business.Dtos.Responses.CreateBrandResponse;

public interface BrandService {
    CreateBrandResponse add(CreateBrandRequest createBrandRequest);
}
