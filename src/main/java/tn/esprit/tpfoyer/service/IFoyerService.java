package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;
import java.util.List;

public interface IFoyerService {

    // Méthode pour récupérer tous les foyers
    public List<Foyer> retrieveAllFoyers();

    // Méthode pour récupérer un foyer par son ID
    public Foyer retrieveFoyer(Long foyerId);

    // Méthode pour ajouter un nouveau foyer
    public Foyer addFoyer(Foyer foyer);

    // Méthode pour supprimer un foyer par son ID
    public void removeFoyer(Long foyerId);

    // Méthode pour modifier un foyer
    public Foyer modifyFoyer(Foyer foyer);

    // D'autres méthodes pourront être ajoutées plus tard (par exemple avec des requêtes JPQL)
}
