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
public class Parking implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String designation;
        private String adresse;
        private int capacite;

        @OneToMany(mappedBy = "p")
        private List<Zone> zones;
    }

