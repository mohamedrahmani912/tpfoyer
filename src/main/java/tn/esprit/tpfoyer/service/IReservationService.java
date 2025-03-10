package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;
import java.util.List;

public interface IReservationService {

    // Méthode pour récupérer toutes les réservations
    public List<Reservation> retrieveAllReservations();

    // Méthode pour récupérer une réservation par son ID
    public Reservation retrieveReservation(String reservationId);

    // Méthode pour ajouter une nouvelle réservation
    public Reservation addReservation(Reservation reservation);

    // Méthode pour supprimer une réservation par son ID
    public void removeReservation(String reservationId);

    // Méthode pour modifier une réservation
    public Reservation modifyReservation(Reservation reservation);

    // D'autres méthodes supplémentaires peuvent être ajoutées, par exemple avec des requêtes JPQL
}
