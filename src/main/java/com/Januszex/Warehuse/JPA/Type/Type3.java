package com.Januszex.Warehuse.JPA.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Type3 extends Type {
    @OneToOne
    @JoinColumn(name = "type_2_id")
    private Type2 type2;


}
