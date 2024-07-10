package com.Januszex.Warehuse.JPA.WorkType.Shipping;

import com.Januszex.Warehuse.JPA.Ordder.Ordder;
import com.Januszex.Warehuse.JPA.WorkType.WorkType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Shipping extends WorkType {

    @OneToOne(mappedBy = "shipping")
    private Ordder ordder;


}
