package com.meli.dnadetector.repository;

import com.meli.dnadetector.entity.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
}
