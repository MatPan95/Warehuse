package com.Januszex.Warehuse.JPA.ClientAddres.Addres;

import com.Januszex.Warehuse.JPA.ClientAddres.Client.Client;
import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Addres extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String country;

    @Column(length = 50, nullable = false)
    private String City;

    @Column(length = 50, nullable = false)
    private String zipCode;

    @Column(length = 50, nullable = false)
    private String Street;

    @Column(length = 50, nullable = false)
    private Integer houseNumber;

    @Column(length = 50, nullable = false)
    private Integer apartmentNumber;

    @ManyToMany(mappedBy = "addresList")
    private List<Client> clientList;

}
