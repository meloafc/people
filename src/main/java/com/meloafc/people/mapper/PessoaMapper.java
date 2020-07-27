package com.meloafc.people.mapper;

import com.meloafc.people.dto.PessoaCreateUpdateDTO;
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
                .cpf(entity.getCpf())
                .perfil(entity.getPerfil())
                .rua(entity.getEndereco().getRua())
                .cidadeId(entity.getEndereco().getCidade().getId())
                .cidadeNome(entity.getEndereco().getCidade().getNome())
                .estadoId(entity.getEndereco().getCidade().getEstado().getId())
                .estadoNome(entity.getEndereco().getCidade().getEstado().getNome())
                .build();
    }

    @Override
    public Pessoa convertToEntity(PessoaDTO dto) {
        return null;
    }

    public Pessoa convertToEntity(PessoaCreateUpdateDTO dto) {
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
