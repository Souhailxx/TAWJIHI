package ma.ac.emi.ginf.tawjihi.tawjihi.controllers;


import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.services.EleveServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/eleve")
public class EleveController {


    private final EleveServices es;

    @Autowired
    public EleveController(EleveServices es) {
        this.es = es;
    }

    @GetMapping("/find")
    public ResponseEntity<List<Eleve>> findAll(){
        List<Eleve> eleves = es.findallEleve();
        return new ResponseEntity<>(eleves, HttpStatus.OK);
    }

    @GetMapping("/find/{idE}")
    public ResponseEntity<Optional<Eleve>> findElevebyID(@PathVariable("idE") int idE){
        Optional<Eleve> eleve = es.getEr().findById(idE);
        return new ResponseEntity<>(eleve, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Eleve> addEleve(@RequestBody Eleve eleve){
        Eleve newEleve = es.addEleve(eleve);
        return new ResponseEntity<>(newEleve, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idE}")
    public ResponseEntity<?> deletePlane(@PathVariable("idE") int idE) {
        es.deleteEleve(idE);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
