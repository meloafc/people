package com.meloafc.people.service;

import com.meloafc.people.model.Pessoa;
import com.meloafc.people.repository.PessoaRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends AbstractService<Pessoa, Long> {

    public PessoaService(PessoaRepository repository) {
        super(repository);
    }

}
