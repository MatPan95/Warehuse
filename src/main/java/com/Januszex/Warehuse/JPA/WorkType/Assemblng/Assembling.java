package com.Januszex.Warehuse.JPA.WorkType.Assemblng;

import com.Januszex.Warehuse.JPA.Ordder.Ordder;
import com.Januszex.Warehuse.JPA.WorkType.WorkType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Assembling extends WorkType {

    @OneToOne(mappedBy = "assembling")
    private Ordder ordder;

}
