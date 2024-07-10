package com.Januszex.Warehuse.JPA.Location;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Sector extends Hall {

    @ManyToOne
    @JoinColumn(name = "hall_id", nullable = false)
    private Hall hall;
}
