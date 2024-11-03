package org.sid.voitureservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.voitureservice.Entities.Client;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue

    private Long id;
    private String matricule;
    private String marque;
    private String model;
    private Long id_client;
    @Transient
    @ManyToOne
    private Client client;

    public Voiture(Long id, String matricule, String marque, String model , Long id_client) {
        this.id=id;
        this.matricule=matricule;
        this.marque=marque;
        this.model=model;
        this.id_client=id_client;
    }
}
