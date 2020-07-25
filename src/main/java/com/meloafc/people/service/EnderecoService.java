package com.meloafc.people.service;

import com.meloafc.people.model.Endereco;
import com.meloafc.people.repository.EnderecoRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService extends AbstractService<Endereco, Long> {

    public EnderecoService(EnderecoRepository repository) {
        super(repository);
    }

}
