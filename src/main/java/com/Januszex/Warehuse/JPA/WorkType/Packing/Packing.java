package com.Januszex.Warehuse.JPA.WorkType.Packing;

import com.Januszex.Warehuse.JPA.Ordder.Ordder;
import com.Januszex.Warehuse.JPA.WorkType.WorkType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Packing extends WorkType {

    @OneToOne(mappedBy = "packing")
    private Ordder ordder;


}
