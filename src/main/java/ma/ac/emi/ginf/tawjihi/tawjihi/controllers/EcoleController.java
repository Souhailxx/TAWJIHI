package ma.ac.emi.ginf.tawjihi.tawjihi.controllers;

import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Ecole;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.services.EcoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/ecole")
public class EcoleController {

    private final EcoleServices ess;

    @Autowired
    public EcoleController(EcoleServices ess){
        this.ess=ess;
    }

    @GetMapping("/find")
    public ResponseEntity<List<Ecole>> findAll(){
        List<Ecole> ecoles = ess.findallEcole();
        return new ResponseEntity<>(ecoles, HttpStatus.OK);
    }

    @GetMapping("/find/{nom}")
    public ResponseEntity<Ecole> findEcolebyNom(String nom){
        Ecole newEcole = ess.findEcolebyNom(nom);
        return new ResponseEntity<>(newEcole , HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public ResponseEntity<Ecole> addEcole(@RequestBody Ecole ecole){
        Ecole newEcole = ess.addEcole(ecole);
        return new ResponseEntity<>(newEcole, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{nom}")
    public ResponseEntity<?> deleteEcole(@PathVariable("nom") String nom) {
        ess.deleteEcolebyNom(nom);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
