package com.Januszex.Warehuse.JPA.Location;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Level extends Hall {

    @ManyToOne
    @JoinColumn(name = "rack_id", nullable = false)
    private Rack rack;
}
