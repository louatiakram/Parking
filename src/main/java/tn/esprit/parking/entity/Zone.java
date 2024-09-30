package tn.esprit.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;
    private double dimension;

    @OneToMany(mappedBy = "z")
    private List<Personnel> responsable;

    @ManyToOne
    private Parking p;

    @OneToOne(mappedBy = "p_z")
    private Personnel z_p;
}
