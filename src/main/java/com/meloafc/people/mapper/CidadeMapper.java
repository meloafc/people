package com.meloafc.people.mapper;

import com.meloafc.people.dto.CidadeDTO;
import com.meloafc.people.model.Cidade;

public class CidadeMapper implements GenericMapper<Cidade, CidadeDTO> {

    @Override
    public CidadeDTO convertToDTO(Cidade entity) {
        return CidadeDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();
    }

    @Override
    public Cidade convertToEntity(CidadeDTO dto) {
        return null;
    }
}
