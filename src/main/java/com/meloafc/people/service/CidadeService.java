package com.meloafc.people.service;

import com.meloafc.people.model.Cidade;
import com.meloafc.people.repository.CidadeRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService extends AbstractService<Cidade, Long, CidadeRepository> {

    public CidadeService(CidadeRepository repository) {
        super(repository);
    }

    public Optional<Cidade> findById(Long id) {
        return getRepository().findById(id);
    }

    public List<Cidade> findByEstadoId(Long estadoId) {
        return getRepository().findByEstadoId(estadoId);
    }

    @Override
    protected String getNotFoundMessage() {
        return "city.notFound";
    }
}
