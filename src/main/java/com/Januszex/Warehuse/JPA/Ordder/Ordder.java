package com.Januszex.Warehuse.JPA.Ordder;

import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import com.Januszex.Warehuse.JPA.WorkType.Assemblng.Assembling;
import com.Januszex.Warehuse.JPA.ClientAddres.ClientAddres;
import com.Januszex.Warehuse.JPA.Location.Location;
import com.Januszex.Warehuse.JPA.WorkType.Packing.Packing;
import com.Januszex.Warehuse.JPA.Product.Product;
import com.Januszex.Warehuse.JPA.WorkType.Shipping.Shipping;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Ordder extends BaseEntity {

    @ManyToMany
    @JoinTable(name = "product_ordder",
            joinColumns = @JoinColumn(name = "product_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "ordder_id", nullable = false))
    private List<Product> productList;


    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne
    @JoinColumn(name = "shipping_id", nullable = false)
    private Shipping shipping;

    @OneToOne
    @JoinColumn(name = "assembling_id", nullable = false)
    private Assembling assembling;

    @OneToOne
    @JoinColumn(name = "packing_id", nullable = false)
    private Packing packing;

    @OneToOne
    @JoinColumn(name = "client_addres_id")
    private ClientAddres clientAddres;

}
