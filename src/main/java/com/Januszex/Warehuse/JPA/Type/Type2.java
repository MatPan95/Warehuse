package com.Januszex.Warehuse.JPA.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Type2 extends Type {

    @OneToOne
    @JoinColumn(name = "type_1_id")
    private Type1 type1;
}
