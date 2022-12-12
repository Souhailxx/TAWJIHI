package ma.ac.emi.ginf.tawjihi.tawjihi.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "Test")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

public class Test implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idT;
    @Column(name = "NoteA")
    private int noteA;
    @Column(name = "NoteB")
    private int noteB;
    @Column(name = "NoteC")
    private int noteC;

    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "eleve_id")
    private Eleve eleve;

    public Test(int noteA, int noteB, int noteC) {
        this.noteA = noteA;
        this.noteB = noteB;
        this.noteC = noteC;
    }
}
