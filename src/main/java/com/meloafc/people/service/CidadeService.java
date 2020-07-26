package com.meloafc.people.service;

import com.meloafc.people.model.Cidade;
import com.meloafc.people.repository.CidadeRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService extends AbstractService<Cidade, Long, CidadeRepository> {

    public CidadeService(CidadeRepository repository) {
        super(repository);
    }

    public List<Cidade> findByEstadoId(Long estadoId) {
        return getRepository().findByEstadoId(estadoId);
    }

}
