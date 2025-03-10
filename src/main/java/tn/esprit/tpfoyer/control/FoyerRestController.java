package tn.esprit.tpfoyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;
@Tag(name = "Gestion Foyer")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    @Autowired
    IFoyerService foyerService;

    // http://localhost:8089/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    @Operation(description = "récupérer toutes les foyers de la base de données")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    // http://localhost:8089/tpfoyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    @Operation(description = "récupérer  les chambres par id")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        Foyer foyer = foyerService.retrieveFoyer(foyerId);
        return foyer;
    }

    // http://localhost:8089/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    @Operation(description = "ajouter foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        Foyer newFoyer = foyerService.addFoyer(foyer);
        return newFoyer;
    }

    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    @Operation(description = "Supprimer foyer")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    @Operation(description = "Modifier foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        Foyer updatedFoyer = foyerService.modifyFoyer(foyer);
        return updatedFoyer;
    }
}
