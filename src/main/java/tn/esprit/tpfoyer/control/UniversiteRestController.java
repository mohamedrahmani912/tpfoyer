package tn.esprit.tpfoyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IUniversiteService;

import java.util.List;
@Tag(name = "Gestion Universite")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    @Autowired
    IUniversiteService universiteService;

    // http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    @Operation(description = "récupérer toutes les universite de la base de données")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8089/tpfoyer/universite/retrieve-universite/1
    @GetMapping("/retrieve-universite/{universite-id}")
    @Operation(description = "récupérer les universite par id")
    public Universite retrieveUniversite(@PathVariable("universite-id") long universiteId) {
        Universite universite = universiteService.retrieveUniversite(universiteId);
        return universite;
    }

    // http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    @Operation(description = "Ajouter universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        Universite newUniversite = universiteService.addUniversite(universite);
        return newUniversite;
    }

    // http://localhost:8089/tpfoyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    @Operation(description = "Supprimer universite")
    public void removeUniversite(@PathVariable("universite-id") long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    @Operation(description = "Modifier universite")
    public Universite modifyUniversite(@RequestBody Universite universite) {
        Universite updatedUniversite = universiteService.modifyUniversite(universite);
        return updatedUniversite;
    }
}
