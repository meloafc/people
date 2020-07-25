package com.meloafc.people.service;

import com.meloafc.people.model.Cidade;
import com.meloafc.people.repository.CidadeRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CidadeService extends AbstractService<Cidade, Long> {

    public CidadeService(CidadeRepository repository) {
        super(repository);
    }

}
