package com.meloafc.people.service;

import com.meloafc.people.enums.Perfil;
import com.meloafc.people.model.Cidade;
import com.meloafc.people.model.Pessoa;
import com.meloafc.people.repository.PessoaRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService extends AbstractService<Pessoa, Long, PessoaRepository> {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private CidadeService cidadeService;

    public PessoaService(PessoaRepository repository) {
        super(repository);
    }

    @Override
    public Pessoa add(Pessoa entity) {
        entity.setId(0L);
        enderecoService.add(entity.getEndereco());
        return super.add(entity);
    }

    @Override
    public Pessoa update(Pessoa entity) {
        Pessoa pessoaSalva = findOne(entity.getId());
        Cidade cidade = cidadeService.findOne(entity.getEndereco().getCidade().getId());

        pessoaSalva.getEndereco().setRua(entity.getEndereco().getRua());
        pessoaSalva.getEndereco().setCidade(entity.getEndereco().getCidade());

        enderecoService.update(pessoaSalva.getEndereco());

        entity.setEndereco(pessoaSalva.getEndereco());
        return super.update(entity);
    }

    public List<Pessoa> find(Long estadoId, Perfil perfil) {
        if(estadoId != null && perfil != null) {
            return getRepository().findByEnderecoCidadeEstadoIdAndPerfil(estadoId, perfil);
        }

        if(estadoId != null && perfil == null) {
            return getRepository().findByEnderecoCidadeEstadoId(estadoId);
        }

        if(estadoId == null && perfil != null) {
            return getRepository().findByPerfil(perfil);
        }

        return find();
    }

    @Override
    protected String getNotFoundMessage() {
        return "person.notFound";
    }
}
