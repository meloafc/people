package com.meloafc.people.repository;

import com.meloafc.people.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Optional<Cidade> findById(Long id);
    List<Cidade> findByEstadoId(Long estadoId);

}
