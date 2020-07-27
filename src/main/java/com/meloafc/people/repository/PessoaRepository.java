package com.meloafc.people.repository;

import com.meloafc.people.enums.Perfil;
import com.meloafc.people.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findByEnderecoCidadeEstadoId(Long estadoId);
    List<Pessoa> findByPerfil(Perfil perfil);
    List<Pessoa> findByEnderecoCidadeEstadoIdAndPerfil(Long estadoId, Perfil perfil);

}
