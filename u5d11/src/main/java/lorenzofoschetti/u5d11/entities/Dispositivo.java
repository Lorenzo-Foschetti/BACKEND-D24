package lorenzofoschetti.u5d11.entities;

import jakarta.persistence.*;
import lombok.*;
import lorenzofoschetti.u5d11.enums.State;
import lorenzofoschetti.u5d11.enums.Type;

import java.util.UUID;

@Entity
@Table(name = "dispositivi")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Dispositivo {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;

    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;

    public Dispositivo(Type type, State state, Dipendente dipendente) {
        this.type = type;
        this.state = state;
        this.dipendente = null;
    }
}
