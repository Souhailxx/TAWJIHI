package ma.ac.emi.ginf.tawjihi.tawjihi.controllers;

import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Test;
import ma.ac.emi.ginf.tawjihi.tawjihi.services.EleveServices;
import ma.ac.emi.ginf.tawjihi.tawjihi.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestServices ts;
    private final EleveServices es;

    @Autowired
    public TestController(TestServices ts, EleveServices es){
        this.ts = ts;
        this.es = es;
    }

    @GetMapping("/find/{idE}")
    public ResponseEntity<Test> findTest(@PathVariable("idE") int idE){
        Test newTest = es.findElevebyId(idE).getTest();
        return new ResponseEntity<>(newTest, HttpStatus.OK);
    }

    @PostMapping("/add/{idE}")
    public ResponseEntity<Test> addTest(@RequestBody Test test,
                                        @PathVariable("idE") int idE){
        /*Test newTest = ts.addTest(test.getNoteA(), test.getNoteB(), test.getNoteC());*/
        Test newTest = ts.addTest(test, idE);
        /*Eleve eleve = es.findElevebyId(idE);
        eleve.setTest(test);
        test.setEleve(eleve);*/
        return new ResponseEntity<>(newTest, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idE}")
    public ResponseEntity<Test> deleteTest(@PathVariable("idE") int idE){
        ts.deleteTest(idE);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
