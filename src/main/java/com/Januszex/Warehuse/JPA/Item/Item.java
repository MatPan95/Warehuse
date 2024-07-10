package com.Januszex.Warehuse.JPA.Item;

import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import com.Januszex.Warehuse.JPA.Location.Location;
import com.Januszex.Warehuse.JPA.Product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Item extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;


}
