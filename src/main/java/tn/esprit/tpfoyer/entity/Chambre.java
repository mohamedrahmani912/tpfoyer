package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany( cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


}