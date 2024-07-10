package com.Januszex.Warehuse.JPA.ClientAddres;

import com.Januszex.Warehuse.JPA.ClientAddres.Addres.Addres;
import com.Januszex.Warehuse.JPA.ClientAddres.Client.Client;
import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "client_addres")
@EqualsAndHashCode(callSuper = true)
@Data
public class ClientAddres extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "addres_id", nullable = false)
    private Addres addres;

}
