package com.meloafc.people.mapper;

import com.meloafc.people.dto.PessoaDTO;
import com.meloafc.people.model.Cidade;
import com.meloafc.people.model.Endereco;
import com.meloafc.people.model.Pessoa;

public class PessoaMapper implements GenericMapper<Pessoa, PessoaDTO> {

    @Override
    public PessoaDTO convertToDTO(Pessoa entity) {
        return PessoaDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();
    }

    @Override
    public Pessoa convertToEntity(PessoaDTO dto) {
        return Pessoa.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .perfil(dto.getPerfil())
                .endereco(Endereco.builder()
                        .rua(dto.getRua())
                        .cidade(Cidade.builder()
                                .id(dto.getCidadeId())
                                .build())
                        .build())
                .build();
    }

}
