package org.sid.voitureservice.Repositories;

import org.sid.voitureservice.Entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}

