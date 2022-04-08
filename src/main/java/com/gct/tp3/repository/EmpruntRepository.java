package com.gct.tp3.repository;

import com.gct.tp3.modele.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    
}
