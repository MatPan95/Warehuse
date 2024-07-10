package com.Januszex.Warehuse.JPA.Product;

import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import com.Januszex.Warehuse.JPA.Ordder.Ordder;
import com.Januszex.Warehuse.JPA.Type.Type3;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Product extends BaseEntity {

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "comment", length = 120, nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "type_3_id")
    private Type3 type3;

    @ManyToMany(mappedBy = "productList")
    private List<Ordder> ordderList;
}
