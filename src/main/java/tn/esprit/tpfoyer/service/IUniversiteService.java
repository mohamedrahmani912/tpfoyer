package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;
import java.util.List;

public interface IUniversiteService {

    // Méthode pour récupérer toutes les universités
    public List<Universite> retrieveAllUniversites();

    // Méthode pour récupérer une université par son ID
    public Universite retrieveUniversite(long universiteId);

    // Méthode pour ajouter une nouvelle université
    public Universite addUniversite(Universite universite);

    // Méthode pour supprimer une université par son ID
    public void removeUniversite(long universiteId);

    // Méthode pour modifier une université
    public Universite modifyUniversite(Universite universite);
}
