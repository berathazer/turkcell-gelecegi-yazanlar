package com.rentacar.manager.business.Dtos.Requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // getter setter
public class CreateBrandRequest {
    @NotNull
    @Size(min = 2, max = 50)
    private String name;
}
