package com.Januszex.Warehuse.JPA.Type;

import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;

@MappedSuperclass
public class Type extends BaseEntity {

    @Column(name = "name", nullable = false, length = 50)
    private String name;
}
