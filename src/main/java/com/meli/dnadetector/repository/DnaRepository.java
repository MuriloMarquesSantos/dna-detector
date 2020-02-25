package com.meli.dnadetector.repository;

import com.meli.dnadetector.entity.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
    Optional<Dna> findByDna(String dna);
    Optional<List<Dna>> findByIsSimian(Boolean isSimian);
}
