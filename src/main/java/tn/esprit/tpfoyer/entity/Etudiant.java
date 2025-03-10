package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;


import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private String ecole;
    private Date dateNaussance;


    @ManyToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
