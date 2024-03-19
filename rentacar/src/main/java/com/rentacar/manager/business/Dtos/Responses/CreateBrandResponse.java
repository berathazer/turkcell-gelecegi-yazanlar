package com.rentacar.manager.business.Dtos.Responses;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBrandResponse {
    private int id;
    private String name;
    private LocalDateTime createdAt;

}
