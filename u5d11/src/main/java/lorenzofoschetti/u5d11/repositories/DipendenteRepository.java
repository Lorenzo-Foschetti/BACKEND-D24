package lorenzofoschetti.u5d11.repositories;

import lorenzofoschetti.u5d11.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {

    Optional<Dipendente> findByEmail(String email);
}

