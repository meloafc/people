package com.meloafc.people.service;

import com.meloafc.people.exception.NotFoundException;
import com.meloafc.people.model.Cidade;
import com.meloafc.people.model.Endereco;
import com.meloafc.people.repository.EnderecoRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService extends AbstractService<Endereco, Long, EnderecoRepository> {

    @Autowired
    private CidadeService cidadeService;

    public EnderecoService(EnderecoRepository repository) {
        super(repository);
    }

    @Override
    public Endereco add(Endereco entity) {
        boolean cidadeExiste = false;

        if(entity.getCidade() != null || entity.getCidade().getId() != null) {
            Optional<Cidade> cidadeOptional = cidadeService.findById(entity.getCidade().getId());
            cidadeExiste = cidadeOptional.isPresent();
        }

        if(!cidadeExiste) {
            throw new NotFoundException("city.notFound");
        }

        return super.add(entity);
    }
}
