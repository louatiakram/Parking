package tn.esprit.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private int age;
    private LocalDate dateRecrutement;
    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    private Poste poste;

    @ManyToOne
    private Zone z;

    @OneToOne
    private Zone p_z;
}