package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;
import java.util.List;

public interface IEtudiantService {

    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> retrieveAllEtudiants();

    // Méthode pour récupérer un étudiant par son ID
    public Etudiant retrieveEtudiant(Long etudiantId);

    // Méthode pour ajouter un nouvel étudiant
    public Etudiant addEtudiant(Etudiant e);

    // Méthode pour supprimer un étudiant par son ID
    public void removeEtudiant(Long etudiantId);

    // Méthode pour modifier un étudiant
    public Etudiant modifyEtudiant(Etudiant etudiant);

    // D'autres méthodes pourront être ajoutées plus tard (par exemple avec des requêtes JPQL)
}
