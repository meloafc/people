package com.meloafc.people.service;

import com.meloafc.people.model.Pessoa;
import com.meloafc.people.repository.PessoaRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends AbstractService<Pessoa, Long, PessoaRepository> {

    @Autowired
    private EnderecoService enderecoService;

    public PessoaService(PessoaRepository repository) {
        super(repository);
    }

    @Override
    public Pessoa add(Pessoa entity) {
        enderecoService.add(entity.getEndereco());
        return super.add(entity);
    }
}
