package com.rentacar.manager.entities;

import com.rentacar.manager.core.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fuels")
public class Fuel extends BaseEntity {
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;
}
