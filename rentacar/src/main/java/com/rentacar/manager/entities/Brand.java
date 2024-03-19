package com.rentacar.manager.entities;


import com.rentacar.manager.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
    @Column(name = "name")
    private String name;

}
